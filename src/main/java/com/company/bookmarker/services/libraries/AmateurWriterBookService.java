package com.company.bookmarker.services.libaries;

import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.entities.users.AmateurWriter;
import com.company.bookmarker.repositories.libaries.AmauteurWriterBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmateurWriterBookService {

    @Autowired
    private AmauteurWriterBookRepository amauteurWriterBookRepository;

    public List<AmateurWriterBook> findAll() {
        return amauteurWriterBookRepository.findAll();
    }

    public AmateurWriterBook findById(Long id) {
        return amauteurWriterBookRepository.findById(id).get();
    }

    public AmateurWriterBook save(AmateurWriterBook amateurWriterBook) {
        return amateurWriterBook.save(amateurWriterBook);
    }

    public void delete(Long id) {
        amauteurWriterBookRepository.deleteById(id);
    }

    public AmateurWriterBook update(Long id, AmateurWriterBook amateurWriterBook) {
        @SuppressWarnings("depreciation")
                AmateurWriterBook entity = amauteurWriterBookRepository.getById(id);
        updateData(enity, amateurWriterBook);
        return amauteurWriterBookRepository.save(entity);
    }

}
