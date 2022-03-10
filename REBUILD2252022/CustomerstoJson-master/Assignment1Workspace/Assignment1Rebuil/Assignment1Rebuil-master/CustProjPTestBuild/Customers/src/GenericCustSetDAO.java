import java.io.Serializable;
import java.util.List;

public interface GenericCustSetDAO<IDType, T extends Serializable>  {

	public GenericCustSetDAO<Long,Customer> getCustomerDao();
	
	void add(IDType id, T entity);

	public void CustomersDao();
	
	
	
	
	void remove(Long id);
	
	T find(IDType id);

	List<T> list();
	
	public void setCustomerDao(GenericCustSetDAO<Long,Customer> dao);

	/**
	 * Remove an entity to the JsonDao
	 *
	 * @param id
	 *            id of the entity to be removed with Type IDType
	 */
	void remove(IDType id, T entity);
	
}