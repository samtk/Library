		
public interface Library {

	
	public void checkOut(Item book);
	
	public void checkIn(Item book);
	
	public void addItem(Item book);
	
	public void removeItem(Item book);
	
	public void updateItem(int id,Item book);
	
	public void registerPerson(Person name);
	
	public void deletePerson(Person name);
	
	public void updatePerson(int id, Person name);
	
}

