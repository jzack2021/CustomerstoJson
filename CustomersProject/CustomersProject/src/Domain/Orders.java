package Domain;


import java.io.Serializable;

public class Orders implements Serializable {

	private static final long serialVersionUID = 7526472295622776147L;
    private Long id3;
    private static Long COUNTER = 0L;
	
    private String  customerFirst;
    private String customerLast;
    private Integer customerZip;
	private String Items;
	private String Orders;
	
	
	public Orders(){
		customerFirst = new String("");
		customerLast = new String("");
		customerZip=0;
		Items = new String("");
		id3 = generateId3();
	}
	

	public Orders(String CustomerFirst3, String customerLast3,Integer Zip, String Items3){
		customerFirst=CustomerFirst3;
		customerLast = customerLast3;
		this.customerZip = Zip;
		Items=Items3;
		id3 = generateId3();
	}
	
	public Orders(Long id3, String CustomerFirst, String CustomerLast, Integer Zip, String Items3){
		customerFirst=CustomerFirst;
		customerLast=CustomerLast;
		customerZip = Zip;
		Items=Items3;
		this.id3=id3;
	}
	
	public Long getId3() {
		return id3;
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
	public String getItem() {
		return Items;
	}
	
	public void SetId(Long id3) {
		this.id3=id3;
	}
	public String setItem(String Items3) {
		return Items;
	}
	public String SetCustomerFirst(String Customer3) {
		return customerFirst;
	}
	public String SetCustomerLast(String CustomerLast) {
		return customerLast;
	}
	public Integer SetZip(Integer Zip) {
		return customerZip;
	}
	public void SetOrder(Long id3, String CustomerFirst, String CustomerLast, Integer Zip, String Items3) {
		this.id3=id3;
		this.customerFirst=CustomerFirst;
		this.customerLast=CustomerLast;
		this.customerZip=Zip;
		this.Items=Items3;
	}
	
	public void SetOrder(String Orders) {
		this.Orders=new String("Orders");
	}
	
	public Long generateId3(){
		return COUNTER++;
	}
}