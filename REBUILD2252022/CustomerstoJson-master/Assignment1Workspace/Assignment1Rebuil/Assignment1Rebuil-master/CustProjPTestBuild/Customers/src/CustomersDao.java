import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;





import java.io.*;
import java.lang.reflect.Type;
public class CustomersDao{

	private GenericCustSetDAO<Long,Customer> CustomersDao;
	Customer Customer;
	
	public CustomersDao() {
		Type t = new TypeToken<Map<Long, Customer>>(){}.getType(); 
		CustomersDao = new JsonDao<>("Customers.json",t); 
	}
	
	public CustomersDao(String filename) {
		 Type t = new TypeToken<Map<Long, Customer>>(){}.getType(); 
		 CustomersDao = new JsonDao<>(filename,t); 
	}
	
	public CustomersDao(GenericCustSetDAO<Long,Customer> dao) {
		
		CustomersDao = dao;
		
	}
	public GenericCustSetDAO<Long,Customer> getCustomerDao() {
		return CustomersDao;
	}
	//public CustomersDao<Long,Customer> getCustomersDao() {
		//return CustomersDao;
	//}
	
public void setCustomerDao(GenericCustSetDAO<Long,Customer> dao){
	this.CustomersDao=dao;
}
	
	public void add(Customer entity)
	{
		CustomersDao.add(entity.getId(), entity);
	}
	public void remove(Long id) {

		CustomersDao.remove(id);
	}
	public Customer find (Long id) {
		CustomersDao.find(id);
		return Customer;
	}
	public List<Customer> list() {
		// TODO Auto-generated method stub
		 return CustomersDao.list();
	}


	

	
}
