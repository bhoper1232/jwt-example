package com.bhoper.jwtexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class HomeController {

    @GetMapping
    public String home(Principal principal) {
        return "Hello, %s!".formatted(principal.getName());
    }

    public static void main(String[] args) {

    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isLetter(word.charAt(i))) stringBuilder.append(word.charAt(i));
            }
            stringBuilder.reverse();
            ans.append(stringBuilder);
            stringBuilder.delete(0, stringBuilder.length() - 1);
        }
        ans.reverse();
        return String.valueOf(ans);
    }
}
