package com.example.BackendApp1;

public class BookValidator {

    public boolean isValid(Book book){
        if(book.getAuthor()=="" || book.getAuthor().equals(null)){
            return false;
        }
        if(book.getName()=="" || book.getName().equals(null)){
            return false;
        }
        return true;
    }
}
