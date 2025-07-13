package com.example.jwt.controller;

import com.example.jwt.model.JwtResponse;
import com.example.jwt.service.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public JwtResponse authenticate(HttpServletRequest request) {
        String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        String[] credentials = extractCredentials(header);
        String username = credentials[0];
        String password = credentials[1];

        if ("user".equals(username) && "pwd".equals(password)) {
            String token = jwtUtil.generateToken(username);
            return new JwtResponse(token);
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    private String[] extractCredentials(String header) {
        String base64Credentials = header.substring("Basic ".length());
        String decoded = new String(Base64.getDecoder().decode(base64Credentials));
        return decoded.split(":", 2);
    }
}