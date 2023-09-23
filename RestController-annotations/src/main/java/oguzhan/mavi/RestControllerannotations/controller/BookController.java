package oguzhan.mavi.RestControllerannotations.controller;

import oguzhan.mavi.RestControllerannotations.bean.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @RequestMapping("/book")
    public String getBook()
    {
        return  "Home Page in the Book Store";
    }

    @RequestMapping("/book/details")
    public Book book ()
    {
        Book book=new Book(1,"Core Java","Learn Core Java and Latest Features");
        return  book;
    }
}
