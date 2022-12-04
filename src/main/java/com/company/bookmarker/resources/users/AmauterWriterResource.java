package com.company.bookmarker.resources.users;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.bookmarker.entities.users.AmateurWriter;
import com.company.bookmarker.services.users.AmauterWriterService;

@RestController
@RequestMapping(value = "/amauterWriter")
@Resource
public class AmauterWriterResource {
    @Autowired
    private AmauterWriterService amauterWriterService;

    @GetMapping
    public ResponseEntity<java.util.List<AmateurWriter>> findAll(){
        return ResponseEntity.ok(amauterWriterService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<AmateurWriter> findById(@PathVariable Long id){
        return ResponseEntity.ok(amauterWriterService.findById(id));
    }
}
