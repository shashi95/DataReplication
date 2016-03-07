package org.action.clusterInterface;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.io.FilePermission;
import org.elasticsearch.rest.RestRequest;
import org.jboss.netty.buffer.BigEndianHeapChannelBuffer;

public class CreateMemoryBuffer {

	
	
	
	
	
  // public static void main(String args[])throws IOException {
   public CreateMemoryBuffer(byte data[],int len,String index,String type,String id){
	// public static void main(String [] args){
		// Scanner in=new Scanner(System.in);
		 
		// byte data[]={10, 123, 10, 34, 100, 111, 99, 34, 58, 34, 116, 104, 105, 115, 32, 105, 115, 32, 100, 111, 99, 32, 110, 111, 58, 49, 34, 10, 125};
		 int writtenOffset=0;
         // ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
         // bOutput.reset();
         String path="C:\\Users\\shaskumar\\Downloads\\Java_lucene\\elasticsearch-2.1.1\\distribution\\src\\main\\resources\\logs\\pendingdata";
         String index_id=index+"#"+type+"#"+id;
    		  Path file = Paths.get(path);
    		 //FilePermission fp=new FilePermission(path, "read,write");
    		
    		  try {
    			Files.write(file, index_id.getBytes(),StandardOpenOption.APPEND);
    			Files.write(file, "\n".getBytes(),StandardOpenOption.APPEND);
				Files.write(file, data,StandardOpenOption.APPEND);
				//Files.write(file, "\n".getBytes(),StandardOpenOption.APPEND);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		  
    		 
   }
}