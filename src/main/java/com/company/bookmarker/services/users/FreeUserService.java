package com.company.bookmarker.services.users;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;

import com.company.bookmarker.entities.users.FreeUser;
import com.company.bookmarker.repositories.users.FreeUserRepository;

import java.util.List;

@Service
public class FreeUserService {
    @Autowired
    private FreeUserRepository freeUserRepository;

    public List<FreeUser> findAll(){
        return freeUserRepository.findAll();
    }

    public FreeUser findById(long id){
        return freeUserRepository.findById(id).get();
    }

    public FreeUser save(FreeUser freeUser){
        return freeUserRepository.save(freeUser);
    }

    public void delete(Long id) {
		freeUserRepository.deleteById(id);
	}
    
    public FreeUser update(Long id, FreeUser freeUser){
        @SuppressWarnings("deprecation")
        FreeUser entity = freeUserRepository.getById(id);
        updateData(entity, freeUser);
        return freeUserRepository.save(entity);
    }

    private void updateData(FreeUser entity, FreeUser freeUser){
        entity.setCpf(freeUser.getCpf());
        entity.setDate(freeUser.getDate());
        entity.setEmail(freeUser.getEmail());
        entity.setGender(freeUser.getGender());
        entity.setFreeLibrary(freeUser.getFreeLibrary());
        entity.setName(freeUser.getName());
        entity.setPassword(freeUser.getPassword());
        entity.setPhoto(freeUser.getPhoto());
        entity.setDate(freeUser.getDate());
        entity.setPhone(freeUser.getPhone());
    }
}
