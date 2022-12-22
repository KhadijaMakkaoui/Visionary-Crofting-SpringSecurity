package com.example.demo.rest;

import com.example.demo.config.JwtUtils;

import com.example.demo.dto.AuthenticationRequest;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationManager authenticationManager;
/*
    private final UserDao userDao;
*/
    private final UserRepository userRepository;
    private final JwtUtils jwtUtils;
    @Autowired
    UserService userService ;
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody AuthenticationRequest request){
        new UsernamePasswordAuthenticationToken(request.getEmail(),request.getPassword());
/*
        final UserDetails user= userDao.findUserByEmail(request.getEmail());
*/

        final UserDetails user= userService.findByEmail(request.getEmail());
        if (user != null){
            final String token=jwtUtils.generateToken(user);
            return ResponseEntity.ok(token);
        }
        return ResponseEntity.badRequest().build();
    }
}
