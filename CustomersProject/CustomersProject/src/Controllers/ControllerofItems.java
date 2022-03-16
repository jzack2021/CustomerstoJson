package Controllers;


import java.io.FileNotFoundException;
import java.util.Scanner;
import Service.setService;
import View.viewer;
import DAO.ItemsDao;
import Domain.Items;
import Domain.Customer;

public class ControllerofItems {
	private setService ItemsService;
	Scanner sc = new Scanner(System.in);
	private viewer view;
	private ItemsDao dao2;
	private Items Items;
	public ControllerofItems(viewer view2, setService ItemsService2) {
		this.view=view2;
		this.ItemsService=ItemsService2;	// TODO Auto-generated constructor stub
		}
	public void ControllerofItems(viewer view2, setService ItemsService2){
		this.view=view2;
		this.ItemsService=ItemsService2;
	}

	public void ControllerOfItems(ItemsDao dao3) {
		this.dao2=dao3;
	}
	public void ControllerOfItems(Items Items) {
		this.Items=Items;
	}
	public void ControllerOfItems(viewer view2) {
		this.view=view2;
	}

}
