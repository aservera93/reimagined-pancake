package com.AnthonyServera.handson6;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;



public class HandsOn {

	public static void main(String[] args) {
		
		
		
		BufferedReader reader;
		FileWriter writer;
		String fileContentsRead = "";
		String finalString = "";
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", " Beat It"};
		
	    
		try{
		    // open the file for writing
		    writer = new FileWriter("songs.txt");
		    // write the song string inside of the file
		    	// loop through all of the songs
		    	for(int i = 0; i < songs.length; i++){
		    		// concatenate the songs names with a comma in between each song name
		    		finalString = finalString + songs[i] + ", ";
		    										
		    	}
		    writer.write(finalString);
		    
		    // close the file (finished writing)
		    writer.close();

		    // open the file for reading
		    reader = new BufferedReader(new FileReader("songs.txt"));
		    String line;
		    while ((line = reader.readLine()) != null) {
		        fileContentsRead = fileContentsRead + line;
		    }
		    // close the file (finished reading)
		    reader.close();
		}
		// catch errors that happened in the try block
		catch(Exception e){
		    // print the stack trace (error)
		    e.printStackTrace();
		}
		
		finally{
			System.out.println(fileContentsRead);
		}
		
		
		
		
	    

	   
		
		
		    
		 
		
		
	}

}
