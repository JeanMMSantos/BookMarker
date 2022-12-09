package com.company.bookmarker.services.users;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.bookmarker.entities.users.AmateurWriter;
import com.company.bookmarker.repositories.users.AmateurWriterRepository;

import java.util.List;

@Service
public class AmateurWriterService {
    @Autowired
    private AmateurWriterRepository amateurWriterRepository;

    public List<AmateurWriter> findAll(){
        return amateurWriterRepository.findAll();
    }

    public AmateurWriter findById(long id){
        return amateurWriterRepository.findById(id).get();
    }

    public AmateurWriter save(AmateurWriter amateurWriter){
        return amateurWriterRepository.save(amateurWriter);
    }

    public void delete(Long id) {
        amateurWriterRepository.deleteById(id);
	}
}
