package com.company.bookmarker.services.users;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

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

    
}
