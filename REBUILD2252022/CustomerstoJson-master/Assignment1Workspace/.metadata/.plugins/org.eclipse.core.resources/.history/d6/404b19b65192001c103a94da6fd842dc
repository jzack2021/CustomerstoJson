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

public class CustomersDao {

	private GenericCustSetDAO<Long,Customer> CustomersDao;
	
	
	public CustomersDao() {
		Type t = new TypeToken<Map<Long, Customer>>(){}.getType(); 
		CustomersDao = new JsonDao<>("citem.json",t); 
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
	
	public void add(Customer entity)
	{
		CustomersDao.add(entity.getId(), entity);
	}
	
//	public List<Customer> list() {
	// CustomersDao.list();
	//}
	
}
