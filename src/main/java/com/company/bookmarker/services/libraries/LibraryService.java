package com.company.bookmarker.services.libraries;

import com.company.bookmarker.entities.libraries.Book;
import com.company.bookmarker.entities.libraries.BookStatus;
import com.company.bookmarker.entities.libraries.Library;
import com.company.bookmarker.repositories.libraries.LibraryRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public Library findAll(){
        return libraryRepository.findAll();
    }

    public Library findById(long id){
        return libraryRepository.findById(id).get();
    }


    public Library insertBook(Long id, Book book, Library library){
        @SuppressWarnings("deprecation")
        Library entity = libraryRepository.getById(id);
        insertData(entity, book);
        return libraryRepository.save(entity);
    }
    private void insertData(Library entity, Book book ){
        BookStatus bookStatus = new BookStatus(book);
        entity. defaultFreeLibrary.add(bookStatus);
    }
    public Library deleteBook(Long id, Long idBookStatus, Library library){
        @SuppressWarnings("deprecation")
        Library entity = libraryRepository.getById(id);
        deleteData(entity, idBookStatus);
        return libraryRepository.save(entity);
    }
    private void deleteData(Library entity, Long idBookStatus){
        entity.defaultFreeLibrary.removeIf(bookStatus-> bookStatus.getID()==idBookStatus );
    }

    public Library updateBook(Long id, BookStatus bookStatus, Library library){
        @SuppressWarnings("deprecation")
        Library entity = libraryRepository.getById(id);
        updateData(entity, bookStatus);
        return libraryRepository.save(entity);
    }
    private void insertData(Library entity, BookStatus bookStatus){
        for(BookStatus index : entity. defaultFreeLibrary){
            if(index.getId()==bookStatus. getId(){
                index.setCurrentPage(bookStatus.getCurrentPage());
                index. setStatus(bookStatus.getStatus());
            }
        }
    }
}