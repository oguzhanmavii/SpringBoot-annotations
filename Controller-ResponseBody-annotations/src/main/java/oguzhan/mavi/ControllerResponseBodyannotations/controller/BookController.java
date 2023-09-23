package oguzhan.mavi.ControllerResponseBodyannotations.controller;


import oguzhan.mavi.ControllerResponseBodyannotations.beans.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BookController {
    @RequestMapping("/book")
    @ResponseBody
    public String bookController()
    {
        return  "Home page is Book Store !";
    }


    @RequestMapping("/book/details")
    @ResponseBody
    public Book getBook()
    {
        Book book= new Book(1,"Core Java","Core Java and Latest Features");
        return book;
    }
}
