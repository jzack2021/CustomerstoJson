import java.io.Serializable;
import java.util.List;

public interface GenericCustSetDAO<IDType, T extends Serializable>  {

	
	void add(IDType id, T entity);

	void remove (IDType id, T entity);
	
	List<T> list();
	
}