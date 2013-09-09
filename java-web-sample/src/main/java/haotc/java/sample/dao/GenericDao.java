package haotc.java.sample.dao;

import java.util.List;

public interface GenericDao<T> {
	List<T> readAll();

	void deleteById(Long id);

	T read(Long id);

	public void create(T t);

	public void update(T t);

	int getRowCount();
}
