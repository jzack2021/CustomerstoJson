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

public class OrdersDao {
	private GenericOrdersSetDAO<Long,Orders> OrdersDao;
	
	
	public OrdersDao() {
		Type t = new TypeToken<Map<Long, Orders>>(){}.getType(); 
		OrdersDao = new JsonDao<>("Orders.json",t); 
	}
	
	public OrdersDao(String filename) {
		 Type t = new TypeToken<Map<Long, Orders>>(){}.getType(); 
		OrdersDao = new JsonDao<>(filename,t); 
	}
	
	public OrdersDao(GenericOrdersSetDAO<Long,Orders> dao) {
		
		OrdersDao = dao;
		
	}
	public GenericOrdersSetDAO<Long,Orders> getOrdersDao() {
		return OrdersDao;
	}
	//public CustomersDao<Long,Customer> getCustomersDao() {
		//return CustomersDao;
	//}
	
	public void add(Orders entity)
	{
		OrdersDao.add(entity.getId3(), entity);
	}

	public List<Orders> list() {
		// TODO Auto-generated method stub
		 return OrdersDao.list();
	}
	
}
