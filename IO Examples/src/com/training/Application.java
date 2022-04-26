package com.training;

import java.io.File;
import java.security.Provider.Service;

import com.training.model.Book;
import com.training.service.BookService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Book java = new Book(104,"headfirst python","mrak",9000);
		//Book java = new Book(104,"headfirst python","mrak",9000);
		
		
		//boolean result = service.wrtieToFile(new File("Books.text"), java);
		//if(result) {
			//System.out.println("one record addes to file");
		//}
		//service.readFromFile(new File("Books.text")).forEach(System.out::println);;
		
		BookService service = new BookService();
		File file = new File("book.ser");
		int ch=2;
		if(ch==1) {
		Book book = new Book(8672,"oracle","pavi",600);
		
		
		//service.writeToStream(null, book);
		boolean result = service.writeToStream(file, book);
		if(result) {
			System.out.println("one record serialized");
		}

	}else {
		Book fromFile=(Book) service.readFromStream(file);
		System.out.println(fromFile.getBookName());
		System.out.println(fromFile);
		
	}

	}
}
