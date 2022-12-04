package com.company.bookmarker.services.users;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.bookmarker.entities.users.AmateurWriter;
import com.company.bookmarker.repositories.users.AmauterWriterRepository;
import java.util.List;

@Service
public class AmauterWriterService {
    @Autowired
    private AmauterWriterRepository amauterWriterRepository;

    public List<AmateurWriter> findAll(){
        return amauterWriterRepository.findAll();
    }

    public AmateurWriter findById(long id){
        return amauterWriterRepository.findById(id).get();
    }
}
