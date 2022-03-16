package Domain;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 7526472295622776147L;
    private Long id;
    private static Long COUNTER = 0L;
	
    private String  customerFirst;
    private String customerLast;
    private Integer customerZip;
	
	
	public Customer(){
		customerFirst = new String("");
		customerLast = new String("");
		customerZip = 0;
		id = generateId();
	}
	

	public Customer(String customerFirst, String customerLast,Integer customerZip){
		customerFirst = new String("");
		customerLast = new String("");
		customerZip = 0;
		id = generateId();
	}
	
	public Customer(Long id, String CustomerFirst, String CustomerLast, Integer customerZip){
		customerFirst = CustomerFirst;
		customerLast = CustomerLast;
		this.customerZip = customerZip;
		
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getCustomerFirst() {
		return customerFirst;
	}
	public String getCustomerLast() {
		return customerLast;
	}
	public Integer getCustomerZip() {
		return customerZip;
	}
	
	public void SetId(Long id) {
		this.id=id;
	}
	
	public void SetCustomerFirst(String customerFirst) {
		this.customerFirst=new String("Customer First");
	}
	
	public void SetCustomerLast(String customerLast) {
		this.customerLast=new String("Customer Last");
	}
	
	public void SetCustomerZip(Integer customerZip) {
		this.customerZip=new Integer("Customer Zip");
	}
	
	public Long generateId(){
		return COUNTER++;
	}
}