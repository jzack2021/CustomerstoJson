import javax.swing.*;
import java.util.*;
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
public class JSONINFOPARCING {
	OrdersDao dao3;
	CustomersDao dao;
	//variables
	static boolean customerFirstbool=false;
	static boolean customerLastbool=false;
	static boolean isItem=false;
	static boolean customerZipbool;
	private setService atMyservice;
	static String last;
	static String first;
	static String ItemFromFile;
	static Integer Zip;
	  static String  customerFirst;
	    static String customerLast;
	    static Integer customerZip;
	    private static
	  Customer Customer;
	  GenericCustSetDAO<Long,Customer> CustomersDao;
	static String key1;
	static String key2;
	static Long id;
	static Integer id2;
	//end variables 
	
	
	
	public JSONINFOPARCING() {
	
	
	
		customerFirst = new String("");
		customerLast = new String("");
		customerZip = 0;
		Customer Customer = new Customer();
		this.dao = new CustomersDao();
		
		id = 0L;
	}
	
	
	public JSONINFOPARCING(CustomersDao dao) {
		this.dao = dao;
	}
	
	//called on #4 prints ORDERS list
	public static void printOrders()throws FileNotFoundException{
		

		

		 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Orders.json");	
		
		 var factory = Json.createParserFactory(null);
		 
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
            // starting array
		 
            parser.next();
            
            
            

            while (parser.hasNext()) {

            	
            	
                // starting object
                var event1 = parser.next();

                
                if (event1 == JsonParser.Event.START_OBJECT) {

                	
                    while (parser.hasNext()) {

                    	
                        var event = parser.next();

                        
                        if (event == JsonParser.Event.KEY_NAME) {

                        	
                            switch (parser.getString()) {
                            
                            

                              

                            
                            case "id3":
                                parser.next();
                              System.out.print("ID");
                                System.out.printf("%d" ,parser.getInt());
                                System.out.println("");
                                break;
                            
                            
                            case "customerFirst":
                                parser.next();
                                		System.out.print("Customer First ");
                                System.out.printf(parser.getString());
                                		System.out.println("");
                                break;


                            case "customerLast":
                                parser.next();
                                System.out.print("Customer Last ");
                                System.out.printf(parser.getString());
                                System.out.println("");
                                break;

                            case "customerZip":
                                parser.next();
                                System.out.print("Customer Zipcode ");
                                System.out.printf("%d" ,parser.getInt());
                                System.out.println("");
                                
                                break;

                            case "Items":
                                parser.next();
                                System.out.print("Item ");
                                System.out.printf(parser.getString());
                                System.out.println("");
                                System.out.println("");
                                break;

                              
                            }
                              
                            }
                        }
                    }
                }
            }
     
	
	public void EditCustomerOrder()throws FileNotFoundException{
		


		 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Orders.json");	
		
		 var factory = Json.createParserFactory(null);
		 
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
		    // starting array
		   System.out.println("Enter Customer firstname");
 	   Scanner in = new Scanner(System.in);
 	  
 	    key1= in.next();
 	   
 	   System.out.println("Enter Customer Last Name");
 	   
 	   key2=in.next();
 	   

		 
		 parser.next();
        //set up to get to the switch statement
        while (parser.hasNext()) {

            // starting object
            var event1 = parser.next();

            if (event1 == JsonParser.Event.START_OBJECT) {

                while (parser.hasNext()) {

                    var event = parser.next();

                    if (event == JsonParser.Event.KEY_NAME) {

                 	
                 	   
                        switch (parser.getString()) {
	
                       
                        
                        case "id3":
                       	 customerFirstbool=false;
                            customerLastbool=false;
                            parser.next();
                        //    System.out.print("Customer #");
                         //   System.out.printf("%d" ,parser.getInt());
                         //   System.out.println("");
                            break;
                        
                        
                        
                        case "customerFirst":
                                parser.next();
                                	//	System.out.print("Customer First ");
                              //  System.out.printf(parser.getString());
                                //		System.out.println("");
                                
                                first =parser.getString();
                                if (first.equalsIgnoreCase(key1)){
                               	 customerFirstbool=true;
                                }
                                break;

                            case "customerLast":
                                parser.next();
                              //  System.out.print("Customer Last ");
                              //  System.out.printf(parser.getString());
                              //  System.out.println("");
                                last=parser.getString();
                                if (last.equalsIgnoreCase(key2)){
                               	 customerLastbool=true;
                                }
                                break;

                            case "customerZip":
                                parser.next();
                              //  System.out.print("Customer Zipcode ");
                               // System.out.printf("%d" ,parser.getInt());
                              //  System.out.println("");
                               // System.out.println("");
                                break;

                            case "Items":
                                parser.next();
                               if (customerFirstbool)
                               	if (customerLastbool){
                                System.out.print("CUSTOMERS ITEM ");
                                System.out.printf(parser.getString());
                              //  System.out.println("");
                                System.out.println("");
                                }
                                break;
                   
                        }
                       
                       
                    }
                }
            }
        }
        System.out.println("Which Item do you want to replace??");
        String Item;
        Item=in.next();
        System.out.println("With what item??");
        String newItem;
        newItem=in.next();
        in.close();
        
        var parser2 = factory.createParser(is, StandardCharsets.UTF_8);
       
	

		 
		 parser2.next();
	        //set up to get to the switch statement
	        while (parser2.hasNext()) {

	            // starting object
	            var event1 = parser2.next();

	            if (event1 == JsonParser.Event.START_OBJECT) {

	                while (parser2.hasNext()) {

	                    var event = parser2.next();

	                    if (event == JsonParser.Event.KEY_NAME) {

	                 	
	                 	   
	                        switch (parser.getString()) {
	
                      
                       
                       case "id3":
                      	isItem=false;
                           parser2.next();
                       id2=parser2.getInt();
                           //    System.out.print("Customer #");
                        //   System.out.printf("%d" ,parser.getInt());
                        //   System.out.println("");
                           break;
                       
                       
                       
                       case "customerFirst":
                               parser2.next();
                               	//	System.out.print("Customer First ");
                             //  System.out.printf(parser.getString());
                               //		System.out.println("");
                               
                               first =parser2.getString();
                           

                           case "customerLast":
                               parser2.next();
                             //  System.out.print("Customer Last ");
                             //  System.out.printf(parser.getString());
                             //  System.out.println("");
                               last=parser2.getString();
                               if (last.equalsIgnoreCase(key2)){
                              	 customerLastbool=true;
                               }
                               break;

                           case "customerZip":
                               parser2.next();
                               Zip=parser2.getInt();
                             //  System.out.print("Customer Zipcode ");
                              // System.out.printf("%d" ,parser.getInt());
                             //  System.out.println("");
                              // System.out.println("");
                               break;

                           case "Items":
                               parser2.next();
                               ItemFromFile=parser2.getString();
                               if (Item.equalsIgnoreCase(ItemFromFile)){
                            	   id=Long.valueOf(id2.longValue());
                               Orders ord=new Orders(id, first, last, Zip, newItem);
                            	   dao3.update(id,  ord);
                                 }
                               
                               
                                 break;
                            
                  
                       }
        
                   }
               }
           }
       }
        
        
        
       
        
	}
	
	
	
	
    
	public static void ListOrdersByCustomer()throws FileNotFoundException{
		


		 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Orders.json");	
		
		 var factory = Json.createParserFactory(null);
		 
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
		    // starting array
		   System.out.println("Enter Customer firstname");
  	   Scanner in = new Scanner(System.in);
  	  
  	    key1= in.next();
  	   
  	   System.out.println("Enter Customer Last Name");
  	   
  	   key2=in.next();
  	   

		 
		 parser.next();
         //set up to get to the switch statement
         while (parser.hasNext()) {

             // starting object
             var event1 = parser.next();

             if (event1 == JsonParser.Event.START_OBJECT) {

                 while (parser.hasNext()) {

                     var event = parser.next();

                     if (event == JsonParser.Event.KEY_NAME) {

                  	
                  	   
                         switch (parser.getString()) {
	
                        
                         
                         case "id3":
                        	 customerFirstbool=false;
                             customerLastbool=false;
                             parser.next();
                         //    System.out.print("Customer #");
                          //   System.out.printf("%d" ,parser.getInt());
                          //   System.out.println("");
                             break;
                         
                         
                         
                         case "customerFirst":
                                 parser.next();
                                 	//	System.out.print("Customer First ");
                               //  System.out.printf(parser.getString());
                                 //		System.out.println("");
                                 
                                 first =parser.getString();
                                 if (first.equalsIgnoreCase(key1)){
                                	 customerFirstbool=true;
                                 }
                                 break;

                             case "customerLast":
                                 parser.next();
                               //  System.out.print("Customer Last ");
                               //  System.out.printf(parser.getString());
                               //  System.out.println("");
                                 last=parser.getString();
                                 if (last.equalsIgnoreCase(key2)){
                                	 customerLastbool=true;
                                 }
                                 break;

                             case "customerZip":
                                 parser.next();
                               //  System.out.print("Customer Zipcode ");
                                // System.out.printf("%d" ,parser.getInt());
                               //  System.out.println("");
                                // System.out.println("");
                                 break;

                             case "Items":
                                 parser.next();
                                if (customerFirstbool)
                                	if (customerLastbool){
                                 System.out.print("CUSTOMERS ITEM ");
                                 System.out.printf(parser.getString());
                               //  System.out.println("");
                                 System.out.println("");
                                 }
                                 break;
                    
                         }
                     }
                 }
             }
         }
	}
	
	
	//called on #4 prints items list
	public static void printItems()throws FileNotFoundException{
		

		

		 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Items.json");	
		
		 var factory = Json.createParserFactory(null);
		 
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
            // starting array
		 
            parser.next();
            
            
            

            while (parser.hasNext()) {

            	
            	
                // starting object
                var event1 = parser.next();

                
                if (event1 == JsonParser.Event.START_OBJECT) {

                	
                    while (parser.hasNext()) {

                    	
                        var event = parser.next();

                        
                        if (event == JsonParser.Event.KEY_NAME) {

                        	
                            switch (parser.getString()) {
                            
                            

                              
                            case "id2":
                                parser.next();
                              System.out.print("ID");
                                System.out.printf("%d" ,parser.getInt());
                                System.out.println("");
                                break;
                            
                            
                            case "Items":
                                parser.next();
                                System.out.print("Item ");
                                System.out.printf("%d" ,parser.getString());
                                System.out.println("");
                                System.out.println("");
                                break;
                              
                            }
                        }
                    }
                }
            }
        }
    

	//called on #4 prints customer list
	public static void printCustomers()throws FileNotFoundException{
		

		

		 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Customers.json");	
		
		 var factory = Json.createParserFactory(null);
		 
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
            // starting array
		 
            parser.next();
            
            
            

            while (parser.hasNext()) {

            	
            	
                // starting object
                var event1 = parser.next();

                
                if (event1 == JsonParser.Event.START_OBJECT) {

                	
                    while (parser.hasNext()) {

                    	
                        var event = parser.next();

                        
                        if (event == JsonParser.Event.KEY_NAME) {

                        	
                            switch (parser.getString()) {
                            
                            

                              
                            case "id":
                                parser.next();
                                System.out.print("Customer #");
                                System.out.printf("%d" ,parser.getInt());
                                System.out.println("");
                                break;
                            
                            
                            
                            case "customerFirst":
                                    parser.next();
                                    		System.out.print("Customer First ");
                                    System.out.printf(parser.getString());
                                    		System.out.println("");
                                    break;

                                case "customerLast":
                                    parser.next();
                                    System.out.print("Customer Last ");
                                    System.out.printf(parser.getString());
                                    System.out.println("");
                                    break;

                                case "customerZip":
                                    parser.next();
                                    System.out.print("Customer Zipcode ");
                                    System.out.printf("%d" ,parser.getInt());
                                    System.out.println("");
                                    System.out.println("");
                                    break;

                              
                            }
                        }
                    }
                }
            }
        }
    

	  //Edits Customer Object
		public void parsetoEditCustomer() throws FileNotFoundException{
			

			

			 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Customers.json");	
			 var factory = Json.createParserFactory(null);
			 var parser = factory.createParser(is, StandardCharsets.UTF_8);
	           // starting array
			   System.out.println("Enter Customer firstname");
	    	   Scanner in = new Scanner(System.in);
	    	   String key1;
	    	    key1= in.next();
	    	   
	    	   System.out.println("Enter Customer Last Name");
	    	   
	    	   String key2=in.next();
	    	   

			 
			 parser.next();
	           //set up to get to the switch statement
	           while (parser.hasNext()) {

	               // starting object
	               var event1 = parser.next();

	               if (event1 == JsonParser.Event.START_OBJECT) {

	                   while (parser.hasNext()) {

	                       var event = parser.next();

	                       if (event == JsonParser.Event.KEY_NAME) {

	                    	
	                    	   
	                           switch (parser.getString()) {

	                             
	                           case "id":
	                               parser.next();
	                          
	                               Integer  EyeD= parser.getInt();
	                               //make long to fit in object
	                               id=Long.valueOf(EyeD.longValue());
	                               
	                            // System.out.printf("%d" ,EyeD           );
	                               break;
	                           
	                           
	                           
	                           case "customerFirst":
	                                   parser.next();

	                                
	                                  first=parser.getString();
	                             //   Customer.SetCustomerFirst(first);
	                                   if (first.equalsIgnoreCase(key1)) {
	                                	 customerFirstbool=true;
	                                //System.out.print(parser.getString()+"was true");
	                                   }
	                                   
	                                   
	                                   break;

	                               case "customerLast":
	                            	   parser.next();
	                            	   last =parser.getString();
	                            	 //Customer.SetCustomerLast(last);
	                            	   if(last.equalsIgnoreCase(key2)) {
	                            		   customerLastbool=true;
	                            	//  System.out.print(parser.getString()+"was true");
	                            	   }
	                            	   
	                            	
	                            	   
	                            	   
	                            	   
	                            	   
	                            	   
	                            	   
	                            	   
	                            	   
	                      

	                                // System.out.printf(parser.getString());
	                                   break;

	                               case "customerZip":
	                                   parser.next();
	                                   	 Zip = parser.getInt();
	                             //    	 System.out.println(Zip);
	                                  //Customer.SetCustomerZip(Zip);
	                                 //System.out.printf("%d" ,parser.getInt());
	                                
	                                   	
	                                     if (customerFirstbool)
	                                    	  if(customerLastbool) {
	                                    		  System.out.println("Enter new Customer first name");
	                                    		  String newFirst = in.next();
	                                    		  System.out.println("Enter new Customer Last name");
	                                    		  String newLast = in.next();
	                                    		  	Customer aCustomer = new Customer(id,newFirst, newLast, Zip); 
	                                    		  	System.out.println("haha" + aCustomer.getCustomerZip());
	                                    		  	setService atMyservice2 = new SetToJsonORService();
	                                    		 
	                                    		 String filename = "Customers.json";
	                                    	
	                                    		  dao.update(id, aCustomer);
	                                    		  
	                                    		  	
	                                    		  	System.out.println("Customer updatd");
	                                    	  }
	                                    	  else {
	                                    		  System.out.println("Not a vailid customer");
	                                    	  }     	
	                         
	                                   customerFirstbool=false;
	                                   
	                                             
	                                   break;
	                           
	                             
	                           }
	                       }
	                   }
	               }
	           }
	       }

	
  //creates customer object to be removed from dao
	public void parsetoRemoveCustomer() throws FileNotFoundException{
		

		

		 var is = new FileInputStream("C:\\Users\\jzack\\REBUILD2252022\\CustomerstoJson-master\\Assignment1Workspace\\Assignment1Rebuil\\Assignment1Rebuil-master\\CustProjPTestBuild\\Customers\\src\\Customers.json");	
		 var factory = Json.createParserFactory(null);
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
           // starting array
		   System.out.println("Enter Customer firstname");
    	   Scanner in = new Scanner(System.in);
    	   String key1;
    	    key1= in.next();
    	   
    	   System.out.println("Enter Customer Last Name");
    	   
    	   String key2=in.next();
    	   

		 
		 parser.next();
           //set up to get to the switch statement
           while (parser.hasNext()) {

               // starting object
               var event1 = parser.next();

               if (event1 == JsonParser.Event.START_OBJECT) {

                   while (parser.hasNext()) {

                       var event = parser.next();

                       if (event == JsonParser.Event.KEY_NAME) {

                    	
                    	   
                           switch (parser.getString()) {

                             
                           case "id":
                               parser.next();
                          
                               Integer  EyeD= parser.getInt();
                               //make long to fit in object
                               id=Long.valueOf(EyeD.longValue());
                               
                            // System.out.printf("%d" ,EyeD           );
                               break;
                           
                           
                           
                           case "customerFirst":
                                   parser.next();

                                
                                  first=parser.getString();
                             //   Customer.SetCustomerFirst(first);
                                   if (first.equalsIgnoreCase(key1)) {
                                	 customerFirstbool=true;
                                //System.out.print(parser.getString()+"was true");
                                   }
                                   
                                   
                                   break;

                               case "customerLast":
                            	   parser.next();
                            	   last =parser.getString();
                            	 //Customer.SetCustomerLast(last);
                            	   if(last.equalsIgnoreCase(key2)) {
                            		   customerLastbool=true;
                            	//  System.out.print(parser.getString()+"was true");
                            	   }
                            	   
                            	
                            	   
                            	   
                            	   
                            	   
                            	   
                            	   
                            	   
                            	   
                      

                                // System.out.printf(parser.getString());
                                   break;

                               case "customerZip":
                                   parser.next();
                                   	 Zip = parser.getInt();
                             //    	 System.out.println(Zip);
                                  //Customer.SetCustomerZip(Zip);
                                 //System.out.printf("%d" ,parser.getInt());
                                
                                   	
                                     if (customerFirstbool)
                                    	  if(customerLastbool) {
                                    		  
                                    		  	Customer aCustomer = new Customer(id,first, last, Zip); 
                                    		  	System.out.println("haha" + aCustomer.getCustomerZip());
                                    		  	setService atMyservice2 = new SetToJsonORService();
                                    		 
                                    		 String filename = "Customers.json";
                                    	
                                    		  dao.remove(id);
                                    		  
                                    		  	
                                    		  	System.out.println("Customer goremoved");
                                    	  }
                                    	  else {
                                    		  System.out.println("Not a vailid customer");
                                    	  }     	
                         
                                   customerFirstbool=false;
                                   customerLastbool=false;
                                             
                                   break;
                           
                             
                           }
                       }
                   }
               }
           }
       }

	

        
    
	
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
