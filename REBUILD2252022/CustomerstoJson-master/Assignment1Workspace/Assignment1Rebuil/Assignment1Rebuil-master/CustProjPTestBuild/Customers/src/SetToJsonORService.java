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
/**
 * 
 * The Example1 Service Layer Implementation is based a design pattern which
 * aims to organize the functionality of the application into logical units that
 * are typically layered on top of much of the low level functionality of the
 * application. This organization helps support service oriented architectures.
 *
 */
public class SetToJsonORService implements setService {

	ItemsDao dao2;
	CustomersDao dao;
	static OrdersDao dao3;
	static Integer ItemStockAmount = 0;
	  static String  customerFirst;
	    static String customerLast;
	    static Integer customerZip;
		
	static String Items;
	static 
	Scanner in = new Scanner(System.in);
	static Long ItemID = 30L;
	
	/**
	 * Default Constructor creates a default CItemDao object
	 */

	public static String setCustFirstName(Scanner sc) {
		System.out.flush();
	
	      System.out.println("Enter Customer First Name");
	    //  ResponseButton Button = new ResponseButton();
	     customerFirst = sc.next();
	     
	    
	      
	   
	     
	      return customerFirst;
	    		  
	    		
	   
	}
	
	public static String setCustLastName(Scanner sc) {
		 System.out.println("Enter Customer Last Name");
	     customerLast = sc.next();
	     return customerLast;
	}
	public static Integer setCustZip(Scanner sc) {
		   System.out.println("Enter Customer Zip Code");
		      customerZip = sc.nextInt();
		      return customerZip;
	}
	public SetToJsonORService() {
		this.dao = new CustomersDao();
		this.dao2=new ItemsDao();
		this.dao3=new OrdersDao();
		
	}
	public static String setItem(Scanner sc) {
		System.out.flush();
	
	      System.out.println("Enter Item");
	      Items = sc.next();
	     
	    return Items;
	}
	public  static OrdersDao setOrder(Scanner sc) {
		
	//	System.out.println("Item");
		//	Items = sc.next();
	
	//	System.out.println("Customer First");
	
	//	customerFirst=sc.next();
	
		return dao3;
		
		
		
		
	}
	



    

	
    
    
    
    /**
	 * Constructor with the DAO provided
	 * 
	 * @param dao
	 *            Data Access Object to use in the service
	 */
	public SetToJsonORService(CustomersDao dao) {
		this.dao = dao;
	}
public SetToJsonORService(ItemsDao dao2) {
	this.dao2 = dao2;
}

public SetToJsonORService(OrdersDao dao3) {
	this.dao3=dao3;
}


	/**
	 * Add a randomly generated CItem element to the repository
	 */
	public void addACustomer() 
	{
		Long ItemID = this.maxCItemId() + 1;
	
		Customer aCustomer = new Customer(ItemID, customerFirst, customerLast, customerZip);
		dao.add(aCustomer);
		
	}
public void removeACustomer() {
	
	
	
}
	public void addAnItem() 
	{
		Long ItemID = this.maxCItemId2() + 1;
	
		Items anItem = new Items(ItemID, Items);
		dao2.add(anItem);
	}
public void addAnOrder() {
	
	
	Long ItemID = this.maxCItemId3() + 1;
	
	Orders anOrder = new Orders (ItemID,customerFirst, customerLast, customerZip, Items );
	
	dao3.add(anOrder);
	
}
	
	/**
	 * Calculate the maximum ID value of elements in the repository
	 * 
	 * @return the maximum id of a CItem in the repository
	 */
 	public Long maxCItemId() {
		List<Customer> clist = dao.list();
		Long max = 0L;
		if (clist.isEmpty())
			return max;
		else {
		Iterator<Customer> iter = clist.iterator();
   		 max = iter.next().getId();
   		 while (iter.hasNext())
   		 {
   			 Customer aCustomer = iter.next();
   			 if (aCustomer.getId() > max)
   			     max = aCustomer.getId();
   		 }
   		 return max;	
		}
	}
 	public Long maxCItemId3() {
		List<Orders> clist = dao3.list();
		Long max = 0L;
		if (clist.isEmpty())
			return max;
		else {
		Iterator<Orders> iter = clist.iterator();
   		 max = iter.next().getId3();
   		 while (iter.hasNext())
   		 {
   			 Orders anOrder = iter.next();
   			 if (anOrder.getId3() > max)
   			     max = anOrder.getId3();
   		 }
   		 return max;	
		}
	}
 	public Long maxCItemId2() {
		List<Items> clist = dao2.list();
		Long max = 0L;
		if (clist.isEmpty())
			return max;
		else {
		Iterator<Items> iter = clist.iterator();
   		 max = iter.next().getId2();
   		 while (iter.hasNext())
   		 {
   			 Items anItem = iter.next();
   			 if (anItem.getId2() > max)
   			     max = anItem.getId2();
   		 }
   		 return max;	
		}
	}
 	
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
                      
                      
                      

                      if (event == JsonParser.Event.KEY_NAME) {
                   	  
                    	  
                    	  
                    	  
                   switch (parser.getString()) {
                   
                   case "customerFirst":
                	   
                   parser.next();
                   	
                   String key = parser.getString();
                   	
                    
                   System.out.printf(key);
                   	
                   System.out.println("");
                	
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
                 		
                 		
                 		Customer aCustomer = new Customer(ItemID, name, parser.next().toString(),parser.getInt());
                 		
                 	 		dao.remove(aCustomer);
                 	 	
                 		
                 	}
                   
                   
                 //  System.out.println("");
                	
                   break;
                   }
        
    }
       }
	
              }
        } 
 	
 
         
     }

	
 }
       

    
 	







