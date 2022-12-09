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

    public List<AmateurWriter> findAll() {

        return amateurWriterRepository.findAll();
    }

    public AmateurWriter findById(Long id) {

        return amateurWriterRepository.findById(id).get();
    }

    public AmateurWriter save(AmateurWriter amateurWriter) {

        return amateurWriterRepository.save(amateurWriter);
    }

    public void delete(Long id) {

        amateurWriterRepository.deleteById(id);
    }

    public AmateurWriter update(Long id, AmateurWriter amateurWriter) {
        @SuppressWarnings("depreciation")
        AmateurWriter entity = amateurWriterRepository.getById(id);
        updateData(entity, amateurWriter);
        return amateurWriterRepository.save(entity);
    }

    private void updateData(AmateurWriter entity, AmateurWriter amateurWriter) {
        entity.setCpf(amateurWriter.getCpf());
        entity.setPhone(amateurWriter.getPhone());
        entity.setDate(amateurWriter.getDate());
        entity.setEmail(amateurWriter.getEmail());
        entity.setGender(amateurWriter.getGender());
        entity.setName(amateurWriter.getName());
        entity.setPassword(amateurWriter.getPassword());
        entity.setPhoto(amateurWriter.getPhoto());

        entity.setPseudonym(amateurWriter.getPseudonym());
        entity.setDescription(amateurWriter.getDescription());
        entity.setMostPopBook(amateurWriter.getMostPopBook());
    }
}

