package Des_Ser;

import java.io.Serializable;

public class Pojo implements Serializable{
     
	 String name;
	 long bal;
	public Pojo(String name, long bal) {
		super();
		this.name = name;
		this.bal = bal;
	}
	
	public Pojo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBal() {
		return bal;
	}
	public void setBal(long bal) {
		this.bal = bal;
	}
	 
	 
}
