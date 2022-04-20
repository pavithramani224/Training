package com.training;

import java.io.File;

import com.training.model.Book;
import com.training.service.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Book java = new Book(104,"headfirst python","mrak",9000);
		//Book java = new Book(104,"headfirst python","mrak",9000);
		
		BookService service = new BookService();
		//boolean result = service.wrtieToFile(new File("Books.text"), java);
		//if(result) {
			//System.out.println("one record addes to file");
		//}
		service.readFromFile(new File("Books.text")).forEach(System.out::println);;

	}

}
