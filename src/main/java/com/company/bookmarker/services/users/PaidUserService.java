package com.company.bookmarker.services.users;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.company.bookmarker.entities.users.PaidUser;
import com.company.bookmarker.repositories.users.PaidUserRepository;

import java.util.List;

@Service
public class PaidUserService {
    @Autowired
    private PaidUserRepository paidUserRepository;

    public List<PaidUser> findAll(){
        return paidUserRepository.findAll();
    }

    public PaidUser findById(long id){
        return paidUserRepository.findById(id).get();
    }
}
