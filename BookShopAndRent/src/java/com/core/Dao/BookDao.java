/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.core.Dao;

import com.core.classes.Book;
import java.util.List;

/**
 *
 * @author kapil
 */
public interface BookDao {
    
    public List<Book> getBookDetails();
    public Book getBook(String isbn);
    
    
    
}
