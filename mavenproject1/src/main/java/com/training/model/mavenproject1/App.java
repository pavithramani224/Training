package com.training.model.mavenproject1;

import java.awt.print.Book;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookName details = new BookName(1,"Story");
        System.out.println("Book No:"+details.getBookNo());
        System.out.println("Book Name"+details.getBookName());
    }
}
