
import java.io.Serializable;

public class Orders implements Serializable {

	private static final long serialVersionUID = 7526472295622776147L;
    private Long id3;
    private static Long COUNTER = 0L;
	
    private String  Customer;
	private String Items;
	private String Order;
	
	
	public Orders(){
		Customer = new String("");
		Items = new String("");
		id3 = generateId3();
	}
	

	public Orders(String Customer3, String Items3){
		Customer=Customer3;
		Items=Items3;
		id3 = generateId3();
	}
	
	public Orders(Long id3, String Customer3, String Items3){
		Customer=Customer3;
		Items=Items3;
		this.id3=id3;
	}
	
	public Long getId3() {
		return id3;
	}
	
	public String getCustomer() {
		return Customer;
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
	public String SetCustomer(String Customer3) {
		return Customer;
	}
	public void SetOrder(Long id3, String Customer3, String Items3) {
		this.id3=id3;
		this.Customer=Customer3;
		this.Items=Items3;
	}
	
	public void SetOrder(String Order) {
		this.Order=new String("Order");
	}
	
	public Long generateId3(){
		return COUNTER++;
	}
}