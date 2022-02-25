import java.io.Serializable;

public class Customer implements Serializable {
	private static final long serialVersionUID = 7526472295622776147L;
	 private Long id;
	 private static Long COUNTER = 0L;
	private String Customer;
	
	
	
	public Customer(){
		Customer = new String("");
		id = generateId();
	}
	

	
	public Customer(String Customer2){
		Customer=Customer2;
		id = getId();
	}
	
	public Customer(Long id, String Customer2){
		Customer=Customer2;
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	
	public void SetId(Long id) {
		this.id=id;
	}

	
	public void setCustomer(String Customer) {
		this.Customer = Customer;
	}
	
	public Long generateId(){
		return COUNTER++;
	}
}
