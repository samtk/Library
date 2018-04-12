
public class Person {
	
	private String name;
	private static int id;
	private static int nextid;
	
	static {
		nextid = 1;
	}
	
	public Person(String name) {
		this.name = name;
		id = nextid++;
	}
	
	public String getName() {
		return name;
	}
	
	public int getID() {
		return id;
	}
	
	
	
	
	
	

}
