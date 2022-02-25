
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
public class SetToJsonORService implements setService{
ItemsDao dao2;
	CustomersDao dao;
	
	static Integer ItemStockAmount = 0;
	static String Customer;
	static String Items;
	Scanner in = new Scanner(System.in);
	static Long ItemID = 30L;
	
	
	public SetToJsonORService() {
		this.dao = new CustomersDao();
	
	}

	public static String setCust(Scanner sc) {
		System.out.flush();
	
	      System.out.println("Enter Customer");
	      Customer = sc.next();
	     
	    return Customer;
	}
	public static String setItem(Scanner sc) {
		System.out.println("Enter Item");
			Items = sc.next();
		return Items;
		
		
		
		
	}
	public SetToJsonORService(CustomersDao dao) {
		
		this.dao = dao;
			
	}
	public SetToJsonORService(ItemsDao dao2) {
		
		this.dao2 = dao2;
		
	}
	public static Long SetId(Scanner sc){
	ItemID = sc.nextLong();
	return ItemID;
	}

	
	
	
	
	public void addACustomer() {
	
		
		Long ItemID = this.maxCItemId() + 1;
	//	int randomNum = 1 + (int) (Math.random() * 100000);
//	CItem anItem = new CItem(id, randomNum, "String with random number " + randomNum);
	//	dao.add(anItem);
		ItemStockAmount+=1;
		Customer anItem = new Customer(ItemID, Customer) ;
		dao.add(anItem);
		//Byte mymymy = ObjectOutputStream.TC_STRING;
		//System.out.println(mymymy);
		
		
		System.out.println("Item Added");
		
		
		
	
		
	}
	
	public void addAnItem() {
		
		Long ItemID = this.maxCItemId() + 1;
		//	int randomNum = 1 + (int) (Math.random() * 100000);
//		CItem anItem = new CItem(id, randomNum, "String with random number " + randomNum);
		//	dao.add(anItem);
			ItemStockAmount+=1;
			Items anItem = new Items(ItemID, Items) ;
			dao2.add(anItem);
			//Byte mymymy = ObjectOutputStream.TC_STRING;
			//System.out.println(mymymy);
			
			
			System.out.println("Item Added");
			
			
			
		
		
		
		
	}
	
	 public void findCustomer()throws FileNotFoundException{
	
		 var is = new FileInputStream("C:\\Users\\jzack\\Assignment1Workspace\\Assignment1Rebuil\\Customers.json");
			
		 var factory = Json.createParserFactory(null);
		 var parser = factory.createParser(is, StandardCharsets.UTF_8);
		 
	
		 
		 
		 
  
         if (!parser.hasNext() && parser.next() != JsonParser.Event.START_ARRAY) {

             return;
         }
     
         while (parser.hasNext()) {
        	 
        	   var event = parser.next();

               // starting object
               if (event == JsonParser.Event.START_OBJECT) {

                   while (parser.hasNext()) {

                       event = parser.next();

                       if (event == JsonParser.Event.KEY_NAME) {
                    	  
                    switch (parser.getString()) {
                    case "Customer":
                    	parser.next();
                    	String key = parser.getString();
                    	
                    	System.out.printf("Customer " + key);
                    	
                    	if (key.equalsIgnoreCase("ffd")) {
                    		System.out.print("ye");
                    	}
                    	
                    	System.out.println("");
                    	break;
                    }
         
     }
        }
	
               }
         }
     }
	
	
    
     
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
   			 Customer anItem = iter.next();
   			 if (anItem.getId() > max)
   			     max = anItem.getId();
   		 }
   		 return max;	
		}
	}
     

}
