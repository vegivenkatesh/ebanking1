package org.banking.service;

import java.util.List;



public interface CrudService<G> {
	public void add(G g);
	public void update(int b,G g);
	public List<G> list();
	public G getById(int b);
	public void remove(int b); 


}
