import java.io.Serializable;
import java.util.List;

public interface GenericCustSetDAO<IDType, T extends Serializable>  {

	public GenericCustSetDAO<Long,Customer> getCustomerDao();
	
	void add(IDType id, T entity);

	public void CustomersDao();
	
	
	
	
	void remove(IDType id, T entity);
	
	T find(IDType id);

	List<T> list();
	
	public void setCustomerDao(GenericCustSetDAO<Long,Customer> dao);
	
}