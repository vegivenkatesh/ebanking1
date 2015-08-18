package org.banking.dao;

import java.util.List;



public interface CrudInterface<E> {
	public void saveOrupdate(E e);
	public List<E> find();
	public void delete(int id);
	public void edit(int b,E e);

}
