package com.bhoper.jwtexample.controller;

import com.bhoper.jwtexample.service.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(Authentication authentication) {
        LOGGER.debug("Token requested for user: %s".formatted(authentication.getName()));
        String token = this.tokenService.generateToken(authentication);
        LOGGER.debug("Token granted %s".formatted(token));
        return token;
    }
}
