package com.yibo.springbootelasticsearchdemo.controller;

import com.yibo.springbootelasticsearchdemo.entity.Book;
import com.yibo.springbootelasticsearchdemo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author: wb-hyb441488
 * @Date: 2019/1/7 20:47
 * @Description:
 */

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable String id){
        return bookService.findBookById(id);
    }

    @PostMapping("/book")
    public Book publishBook(@RequestBody Book book){
        book.setPublishedDate(new Date());
        bookService.saveBook(book);
        return book;
    }

    @GetMapping("/book/search")
    public List<Book> searchBook(@RequestParam(value = "pageNumber") Integer pageNumber,
                                 @RequestParam(value = "pageSize", required = false) Integer pageSize,
                                 @RequestParam(value = "searchContent") String searchContent){
        return bookService.searchBook(pageNumber,pageSize,searchContent);
    }
}
