package com.training.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import com.training.ifaces.crudRespository;
import com.training.model.Book;

public class BookService implements crudRespository {
	 private ArrayList<Book> bookList;

	public BookService() {
		super();
		// TODO Auto-generated constructor stub
		this.bookList=new ArrayList<>();
}
 
	@Override
	public boolean add(Book book) {
		// TODO Auto-generated method stub
		return bookList.add(book);
	}


	@Override
	public boolean remove(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return this.bookList;
	}

	

	@Override
	public Book findBy(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book update(Book oldbook, Book newBook) {
		// TODO Auto-generated method stub
		if(this.bookList.contains(oldbook)) {
			int idxpos = this.bookList.indexOf(oldbook);
			this.bookList.set(idxpos, newBook);
		}
		else {
			
		}
		return null;
	}
	public List<Book> grtThan(double price){
		Predicate<Double>grtThan=(value)->value>300.00;
		this.bookList.forEach(book->
		{
			System.out.println(book.getPrice());
		});
		return bookList;
	}

}
