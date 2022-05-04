package com.training.model;



	import java.io.*;
	public class Fruits{
	  public static void main(String[] args) {
	    File myFile = new File("Fruit.txt");
	    File myFile1 = new File("File.txt");
	  try {
	      
	      FileWriter myWriter = new FileWriter("Fruit.txt");
	      myWriter.write("Apple is red in colour\nOrange is round in shape\nBanana is good for health\nGrapes will grow as bunch\nMango is a seasonal fruit");
	      myWriter.close();
	      
	      FileWriter myWriter1 = new FileWriter("File.txt");
	      myWriter1.write("Description");
	      myWriter1.close();
	      
	      System.out.println("Files are created");
	      
	      
	      
	      PrintWriter pw = new PrintWriter("File.txt");
	          
	        
	        BufferedReader br = new BufferedReader(new FileReader("Fruit.txt"));
	          
	        String line = br.readLine();
	          
	        while (line != null)
	        {
	            pw.println(line);
	            line = br.readLine();
	        }
	        pw.flush();
	          

	        br.close();
	        pw.close();
	        
	           if (myFile.delete()) {
	            System.out.println("File deleted successfully");
	        }
	        else {
	            System.out.println("Failed to delete the file");
	        }
	      
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }

	  }
	}

