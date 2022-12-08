package com.company.bookmarker.resources.users;

import java.net.URI;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
    public ResponseEntity<FreeUser> save(@RequestBody FreeUser freeUser){
        freeUser = freeUserService.save(freeUser);
        freeUserService.save(freeUser);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(freeUser.getId()).toUri();
        return ResponseEntity.created(uri).body(freeUser);
    }
}
