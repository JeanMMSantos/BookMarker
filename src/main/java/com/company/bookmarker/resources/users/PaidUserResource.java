package com.company.bookmarker.resources.users;


import java.net.URI;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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

    @PostMapping
    public ResponseEntity<PaidUser> save(@RequestBody PaidUser paidUser){
        paidUser = paidUserService.save(paidUser);
        paidUserService.save(paidUser);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(paidUser.getId()).toUri();
        return ResponseEntity.created(uri).body(paidUser);
    }

    @DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		paidUserService.delete(id);
		return ResponseEntity.noContent().build();
	}

    @PutMapping(value = "/{id}")
    public ResponseEntity<PaidUser> updated(@PathVariable Long id, @RequestBody PaidUser paidUser) {
        paidUser = paidUserService.update(id, paidUser);
        return ResponseEntity.ok(paidUser);
    }
}
