package com.company.bookmarker.resources.users;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.company.bookmarker.entities.users.AmateurWriter;
import com.company.bookmarker.services.users.AmateurWriterService;

import java.net.URI;

@RestController
@RequestMapping(value = "/amateurWriter")
@Resource
public class AmateurWriterResource {
    @Autowired
    private AmateurWriterService amateurWriterService;

    @GetMapping
    public ResponseEntity<java.util.List<AmateurWriter>> findAll(){
        return ResponseEntity.ok(amateurWriterService.findAll());
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<AmateurWriter> findById(@PathVariable Long id){
        return ResponseEntity.ok(amateurWriterService.findById(id));
    }

    @PostMapping
    public ResponseEntity<AmateurWriter> save(@RequestBody AmateurWriter amateurWriter){
        amateurWriter = amateurWriterService.save(amateurWriter);
        amateurWriterService.save(amateurWriter);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(amateurWriter.getId()).toUri();
        return ResponseEntity.created(uri).body(amateurWriter);
    }

    @DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		amateurWriterService.delete(id);
		return ResponseEntity.noContent().build();
	}
}
