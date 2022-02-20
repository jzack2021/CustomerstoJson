
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SetToJsonORService implements setService{

	CustomersDao dao;
	static Integer ItemStockAmount = 0;
	static String Customer;
	Scanner in = new Scanner(System.in);
	static Long ID;
	
	
	public SetToJsonORService() {
		this.dao = new CustomersDao();
	}
	
	public static String setCust(Scanner sc) {
		System.out.flush();
	
	      System.out.println("Enter Customer");
	      Customer = sc.next();
	     
	    return Customer;
	}
	
	public SetToJsonORService(CustomersDao dao) {
		
		this.dao = dao;
			
	}
	
	public static Long SetId(Scanner sc){
		
	ID = sc.nextLong();
	return ID;
	}

	
	public void addACustomer() {
	
		
		Long ItemID = 1L;
	//	int randomNum = 1 + (int) (Math.random() * 100000);
//	CItem anItem = new CItem(id, randomNum, "String with random number " + randomNum);
	//	dao.add(anItem);
		ItemStockAmount+=1;
		Customer aCustomer = new Customer(ItemID, Customer) ;
		dao.add(aCustomer);
		//Byte mymymy = ObjectOutputStream.TC_STRING;
		//System.out.println(mymymy);
		
		
		System.out.println("Customer Added");
		
		
		
		
	
		
	}
	
	

	


}
