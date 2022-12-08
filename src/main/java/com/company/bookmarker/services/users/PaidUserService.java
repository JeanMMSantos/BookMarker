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

    public PaidUser save(PaidUser paidUser){
        return paidUserRepository.save(paidUser);
    }

    public void delete(Long id) {
		paidUserRepository.deleteById(id);
	}
    
    public PaidUser update(Long id, PaidUser paidUser){
        @SuppressWarnings("deprecation")
        PaidUser entity = paidUserRepository.getById(id);
        updateData(entity, paidUser);
        return paidUserRepository.save(entity);
    }

    private void updateData(PaidUser entity, PaidUser paidUser){
        entity.setCpf(paidUser.getCpf());
        entity.setDate(paidUser.getDate());
        entity.setEmail(paidUser.getEmail());
        entity.setGender(paidUser.getGender());
        entity.setFreeLibrary(paidUser.getFreeLibrary());
        entity.setName(paidUser.getName());
        entity.setPassword(paidUser.getPassword());
        entity.setPhoto(paidUser.getPhoto());
        entity.setDate(paidUser.getDate());
        entity.setPhone(paidUser.getPhone());
        entity.setPaymentType(paidUser.getPaymentType());
        entity.setPaymentTypeNumber(paidUser.getPaymentTypeNumber());
        entity.setPaymentValue(paidUser.getPaymentValue());
    }
}
