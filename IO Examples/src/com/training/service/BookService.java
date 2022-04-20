package com.training.service;
import java.io.*;
import java.util.*;

import com.training.model.Book;

public class BookService {
	public boolean wrtieToFile(File file,Book book) {
	boolean result=false;
	try (
		PrintWriter writer=new PrintWriter
				(new FileWriter(file,true)))
		{
			writer.println(book);
			result=true;
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return result;
	
	}
	public List<Book> readFromFile(File file){
		List<Book> bookList = new ArrayList<Book>();
		String line = null;
	
		try(BufferedReader reader =
				new BufferedReader(new FileReader(file))){
			while((line=reader.readLine())!=null) {
				String[] values = line.split(",");
				Book book = new Book(Integer.parseInt(values[0]),
						values[1],values[2],
						Double.parseDouble(values[3]));
				bookList.add(book);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return bookList;
	}
	

}
