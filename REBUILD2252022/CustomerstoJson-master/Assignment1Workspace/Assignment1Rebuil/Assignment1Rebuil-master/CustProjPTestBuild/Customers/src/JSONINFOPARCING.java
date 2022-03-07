import javax.swing.*;
import java.io.FileReader;

import java.io.FileReader;
import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.io.*;
import java.util.ArrayList;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.Scanner;
import java.awt.*;  
import java.awt.event.*;  
public class JSONINFOPARCING{
	static boolean customerFirstbool;
	static boolean customerLastbool;
	static boolean customerZipbool;
	Scanner in = new Scanner(System.in);
	  static String  customerFirst;
	    static String customerLast;
	    static Integer customerZip;
	 
	
	
	public static void printCustomers()throws FileNotFoundException{
		
		var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Customers.json");
		var factory = Json.createParserFactory(null);
		var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
		 
		 
	
	  if (!parser.hasNext() && parser.next() != JsonParser.Event.START_ARRAY) {

         return;
      }
	    
	    
	    
   
     while (parser.hasNext()) {
      	 
     	var event = parser.next();
          
      	   
      	   
      	  if (event == JsonParser.Event.START_OBJECT) {

      
           	 
           	 
           	 
           while (parser.hasNext()) {

                    event = parser.next();
                     

		 
	
               if (event == JsonParser.Event.KEY_NAME || 
            		   event == 	   JsonParser.Event.VALUE_STRING ||
            				   event ==  		   JsonParser.Event.VALUE_NUMBER)
         
	  
                 switch (parser.getString()) {
                 
                 
                 case "customerFirst": 
                //event = JsonParser.Event.KEY_NAME;
     String key  = parser.getString();
                       System.out.println(key);
                       break;
                 case "customerLast":
                     String key2 = parser.getString();
                                       System.out.println(key2);
                                       break;
                 case "customerZip":
                	 event = JsonParser.Event.VALUE_NUMBER;
   Integer in  = parser.getInt();
                                       System.out.println(in);
                                       break;
                 }
                 }
           }
      	  }
     }
               //   parser.next();
                  	
               //   String key = parser.getString();
                  	
                   
                //  System.out.printf(key);
                  	
                //  System.out.println("");
               	
                //  break;
                //  }
                  //   case "customerLast":
                     	   
                  //       parser.next();
                         	
                  //       String key = parser.getString();
                         	
                          
                   //      System.out.printf(key);
                         	
                     //    System.out.println("");
                      	
                     //    break;
                      //   }
       
  
	

	

        
    
	
	public void parceToCustomer()throws FileNotFoundException{
    
   	
		 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Customers.json");
		 var factory = Json.createParserFactory(null);
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
		 
		 
	
	    if (!parser.hasNext() && parser.next() != JsonParser.Event.START_ARRAY) {

           return;
       }
	    
	    
	    
   
       while (parser.hasNext()) {
      	 
      	var event = parser.next();
          
      	   
      	   
      	   if (event == JsonParser.Event.START_OBJECT) {

      
           	 
      		System.out.println("Enter name");
     	  String name = in.next();	
           	 
           	 while (parser.hasNext()) {

                     event = parser.next();
                     
                     
                     

                     if (event == JsonParser.Event.KEY_NAME) {
                  	  
                   	  
                   	    
                  switch (parser.getString()) {
                  
                  case "customerFirst":
               	   
                  parser.next();
                  	
                  String key = parser.getString();
                 	
                	if (name.equalsIgnoreCase(key)) {
                		
                		
                	
                		
                	}
                  
                  
                  System.out.println("");
               	
                  break;
                  }
       
   }
      }
	
             }
       } 
	

        
    }

	
}
