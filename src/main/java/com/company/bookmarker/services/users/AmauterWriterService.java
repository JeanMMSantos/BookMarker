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

    public AmateurWriter findById(Long id){
        return amauterWriterRepository.findById(id).get();
    }

    public AmateurWriter save(AmateurWriter amateurWriter){
        return amauterWriterRepository.save(amateurWriter);
    }

    public void delete(Long id) {
		amauterWriterRepository.deleteById(id);
	}

    public AmateurWriter update(Long id, AmateurWriter amateurWriter){
        @SuppressWarnings("depreciation")
        AmateurWriter entity = amauterWriterRepository.getById(id);
        updateData(entity, amateurWriter);
        return amauterWriterRepository.save(entity);
    }
    
    private void updateData(AmateurWriter entity, AmateurWriter amateurWriter){
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

