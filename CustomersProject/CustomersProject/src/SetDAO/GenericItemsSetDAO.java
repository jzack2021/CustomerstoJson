package SetDAO;

import java.io.Serializable;
import java.util.List;

public interface GenericItemsSetDAO<IDType, T extends Serializable>  {

	
	void add(IDType id2, T entity);

	List<T> list();
	
	
	
}
