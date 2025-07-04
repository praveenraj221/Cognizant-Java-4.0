package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileWriter;
import java.io.IOException;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write("BookService is working...\n");
            writer.write("BookRepository is working...\n");
            System.out.println("Output written to output.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Still printing to console as well
        bookService.display();
    }
}
