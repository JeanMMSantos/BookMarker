package com.company.bookmarker.services.libraries;

<<<<<<< HEAD:src/main/java/com/company/bookmarker/services/libaries/AmateurWriterBookService.java
import com.company.bookmarker.entities.libaries.AmateurWriterBook;
import com.company.bookmarker.repositories.libaries.AmateurWriterBookRepository;
=======
import com.company.bookmarker.entities.libraries.AmateurWriterBook;
import com.company.bookmarker.entities.users.AmateurWriter;
import com.company.bookmarker.repositories.libraries.AmauteurWriterBookRepository;

import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> be6275fbb6d7d051d5a0f48cd34c8736e95d3b40:src/main/java/com/company/bookmarker/services/libraries/AmateurWriterBookService.java
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmateurWriterBookService {

        private AmateurWriterBookRepository amateurWriterBookRepository;

        public List<AmateurWriterBook> findAll() {
                return amateurWriterBookRepository.findAll();
        }

        public AmateurWriterBook findById(Long id) {
                return amateurWriterBookRepository.findById(id).get();
        }

        public AmateurWriterBook save(AmateurWriterBook amateurWriterBook) {
                return amateurWriterBookRepository.save(amateurWriterBook);
        }

        public void delete(Long id) {
                amateurWriterBookRepository.deleteById(id);
        }

        public AmateurWriterBook update(Long id, AmateurWriterBook amateurWriterBook) {
                @SuppressWarnings("depreciation")
                AmateurWriterBook entity = amateurWriterBookRepository.getReferenceById(id);
                updateData(entity, amateurWriterBook);
                return amateurWriterBookRepository.save(entity);
        }

        private void updateData(AmateurWriterBook entity, AmateurWriterBook amateurWriterBook) {
                entity.setBookValue(amateurWriterBook.getBookValue());
        }

}
