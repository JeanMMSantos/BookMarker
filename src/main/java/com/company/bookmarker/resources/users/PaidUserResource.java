package com.company.bookmarker.resources.users;


import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.bookmarker.entities.users.PaidUser;
import com.company.bookmarker.services.users.PaidUserService;

@RestController
@RequestMapping(value = "/paidUser")
@Resource
public class PaidUserResource {
    @Autowired
    private PaidUserService paidUserService;

    @GetMapping
    public ResponseEntity<java.util.List<PaidUser>> findAll(){
        return ResponseEntity.ok(paidUserService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<PaidUser> findById(@PathVariable Long id){
        return ResponseEntity.ok(paidUserService.findById(id));
    }
}
