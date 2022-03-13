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
public class CustomersDao<IDType, T extends Serializable>{

	private GenericCustSetDAO<IDType,Customer> CustomersDao;
	Customer Customer;
	
	public CustomersDao() {
		Type t = new TypeToken<Map<Long, Customer>>(){}.getType(); 
		CustomersDao = new JsonDao<>("Customers.json",t); 
	}
	
	public CustomersDao(String filename) {
		 Type t = new TypeToken<Map<Long, Customer>>(){}.getType(); 
		 CustomersDao = new JsonDao<>(filename,t); 
	}
	
	public CustomersDao(GenericCustSetDAO<IDType,Customer> dao) {
		
		CustomersDao = dao;
		
	}
	public GenericCustSetDAO<IDType,Customer> getCustomerDao() {
		return CustomersDao;
	}
	//public CustomersDao<Long,Customer> getCustomersDao() {
		//return CustomersDao;
	//}
	
public void setCustomerDao(GenericCustSetDAO<IDType,Customer> dao){
	this.CustomersDao=dao;
}
	
	public void add(IDType id, Customer entity)
	{
		CustomersDao.add(id, entity);
	}
	public void remove(Long id) {

		CustomersDao.remove(id);
	}
	public void update(IDType id , Customer entity) {

		
CustomersDao.update(id, entity);
	}
//	public Customer find (Long id) {
	//	CustomersDao.find(id);
	//	return Customer;
	//}
	public List<Customer> list() {
		// TODO Auto-generated method stub
		 return CustomersDao.list();
	}


	

	
}
