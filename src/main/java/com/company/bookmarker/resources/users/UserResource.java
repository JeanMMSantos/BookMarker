package com.company.bookmarker.resources.users;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.bookmarker.entities.users.User;
import com.company.bookmarker.services.users.UserService;

@RestController
@RequestMapping(value = "/user")
@Resource
public class UserResource {
    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<java.util.List<User>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        return ResponseEntity.ok(userService.findById(id));
    }
}
