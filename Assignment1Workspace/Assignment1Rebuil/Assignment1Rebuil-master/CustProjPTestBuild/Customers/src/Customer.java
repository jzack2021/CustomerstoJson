import java.io.Serializable;

public class Customer implements Serializable {

	private Long id = 4L;
	private String Customer;
	
	
	
	public Customer(){
		Customer = new String("");
		id = getId();
	}
	
	public void SetCustomer(){
		Customer = new String("");
		id = getId();
	}
	
	public Customer(String Customer2){
		Customer=Customer2;
		id = getId();
	}
	
	public Customer(Long id, String Customer2){
		Customer=Customer2;
		this.id = id;
	}
	
	public Long getID() {
		return id;
	}
	
	public String getCustomer() {
		return Customer;
	}
	
	public void SetId(Long id) {
		this.id=id;
	}
	
	public void SetCustomer(String Customer) {
		this.Customer=new String("Customer");
	}
	
	public Long getId(){
		return id++;
	}
}
