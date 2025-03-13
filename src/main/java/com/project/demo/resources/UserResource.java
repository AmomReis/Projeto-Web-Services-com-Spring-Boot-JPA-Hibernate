package com.project.demo.resources;

import com.project.demo.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User("12345", "91985236610", "mirandoamom@gmail.com", "Amom Reis", 1L);
        return ResponseEntity.ok().body(u);
    }
}
