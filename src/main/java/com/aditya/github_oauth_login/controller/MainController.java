package com.aditya.github_oauth_login.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class MainController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/profile")
    public String profile(@AuthenticationPrincipal OAuth2User principal, Model model) {
        if (principal != null) {
            String name = principal.getAttribute("name");
            String login = principal.getAttribute("login");
            String avatarUrl = principal.getAttribute("avatar_url");
            String htmlUrl = principal.getAttribute("html_url");
            String email = principal.getAttribute("email");
            String location = principal.getAttribute("location");
            int publicRepos = principal.getAttribute("public_repos");
            int followers = principal.getAttribute("followers");
            int following = principal.getAttribute("following");

            model.addAttribute("name", name);
            model.addAttribute("login", login);
            model.addAttribute("avatarUrl", avatarUrl);
            model.addAttribute("htmlUrl", htmlUrl);
            model.addAttribute("email", email);
            model.addAttribute("location", location);
            model.addAttribute("publicRepos", publicRepos);
            model.addAttribute("followers", followers);
            model.addAttribute("following", following);
        }
        return "profile";
    }
}