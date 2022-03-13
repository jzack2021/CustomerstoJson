import java.io.Serializable;
import java.util.List;

public interface GenericOrdersSetDAO<IDType, T extends Serializable>  {

	
	void add(IDType id3, T entity);

	List<T> list();
	
	void update(IDType id3, T entity);
	
}
