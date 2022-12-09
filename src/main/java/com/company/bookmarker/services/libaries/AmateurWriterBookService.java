package com.company.bookmarker.services.libaries;

import com.company.bookmarker.entities.libaries.AmateurWriterBook;
import com.company.bookmarker.repositories.libaries.AmateurWriterBookRepository;
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
