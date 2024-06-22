/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unimontes.library.management.controller;

import br.unimontes.library.management.model.BookModel;
import br.unimontes.library.management.view.BookView;
/**
 *
 * @author marce
 */
public class BookController {
    private BookModel bookModel;
    private BookView bookView;

    public BookController(BookModel bookModel, BookView bookView) {
        this.bookModel = bookModel;
        this.bookView = bookView;
    }
   //bookView.btnSubmit 
   
}
