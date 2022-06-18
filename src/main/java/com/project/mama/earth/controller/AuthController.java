package com.project.mama.earth.controller;

import com.project.mama.earth.dto.AuthenticationResponse;
import com.project.mama.earth.dto.LoginRequest;
import com.project.mama.earth.dto.RegisterRequest;
import com.project.mama.earth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
//@CrossOrigin(
//        origins = {"http://localhost:4200/"},
//        allowCredentials = "false",
//        originPatterns = {"*"},
//        allowedHeaders = {"*"},
//        exposedHeaders = {"*"},
//        maxAge = 60 * 30,
//        methods = {RequestMethod.GET, RequestMethod.DELETE, RequestMethod.POST, RequestMethod.PUT}
//)
public class AuthController {
    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody RegisterRequest registerRequest) {
        authService.register(registerRequest);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest) {
        return authService.login(loginRequest);
    }
}
