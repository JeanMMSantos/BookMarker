package com.company.bookmarker.resources.users;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.bookmarker.entities.users.FreeUser;
import com.company.bookmarker.repositories.users.FreeUserRepository;
import com.company.bookmarker.services.users.FreeUserService;

@RestController
@RequestMapping(value = "/freeUser")
@Resource
public class FreeUserResource {
    @Autowired
    private FreeUserService freeUserService;

    @GetMapping
    public ResponseEntity<java.util.List<FreeUser>> findAll(){
        return ResponseEntity.ok(freeUserService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<FreeUser> findById(@PathVariable Long id){
        return ResponseEntity.ok(freeUserService.findById(id));
    }

    @PostMapping
    public FreeUser create(@RequestBody FreeUser freeUser){
        return FreeUserRepository.save(freeUser);
    }
}
