
package DAO;

import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import SetDAO.GenericOrdersSetDAO;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import Domain.Orders;

public class OrdersDao<IDType, T extends Serializable> {
	private GenericOrdersSetDAO<IDType,Orders> OrdersDao;
	Orders Orders;
	
	public OrdersDao() {
		Type t = new TypeToken<Map<Long, Orders>>(){}.getType(); 
		OrdersDao = new JsonDao<>("Orders.json",t); 
	}
	
	public OrdersDao(String filename) {
		 Type t = new TypeToken<Map<Long, Orders>>(){}.getType(); 
		OrdersDao = new JsonDao<>(filename,t); 
	}
	
	public OrdersDao(GenericOrdersSetDAO<IDType,Orders> dao3) {
		
		OrdersDao = dao3;
		
	}
	public GenericOrdersSetDAO<IDType,Orders> getOrdersDao() {
		return OrdersDao;
	}
	//public CustomersDao<Long,Customer> getCustomersDao() {
		//return CustomersDao;
	//}
	
	public void add(IDType id, Orders entity)
	{
		OrdersDao.add(id, entity);
	}
	public void update (IDType id, Orders entity) {
		OrdersDao.update(id, entity);
	}

	public List<Orders> list() {
		// TODO Auto-generated method stub
		 return OrdersDao.list();
	}
	
}
