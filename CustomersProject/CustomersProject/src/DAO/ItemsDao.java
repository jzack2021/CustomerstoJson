
package DAO;

import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

import java.util.List;
import Domain.Items;
import Domain.Items;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import SetDAO.GenericItemsSetDAO;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import SetDAO.GenericItemsSetDAO;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ItemsDao {
	private GenericItemsSetDAO<Long,Items> ItemsDao;
	
	
	public ItemsDao() {
		Type t = new TypeToken<Map<Long, Items>>(){}.getType(); 
		ItemsDao = new JsonDao<>("Items.json",t); 
	}
	
	public ItemsDao(String filename) {
		 Type t = new TypeToken<Map<Long, Items>>(){}.getType(); 
		ItemsDao = new JsonDao<>(filename,t); 
	}
	
	public ItemsDao(GenericItemsSetDAO<Long,Items> dao) {
		
		ItemsDao = dao;
		
	}
	public GenericItemsSetDAO<Long,Items> getItemsDao() {
		return ItemsDao;
	}
	//public CustomersDao<Long,Customer> getCustomersDao() {
		//return CustomersDao;
	//}
	
	public void add(Items entity)
	{
		ItemsDao.add(entity.getId2(), entity);
	}

	public List<Items> list() {
		// TODO Auto-generated method stub
		 return ItemsDao.list();
	}
	
}
