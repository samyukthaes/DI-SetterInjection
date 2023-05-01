package ustbatchno3.DI_Setterinjection;

public class Role {
	private String character;
	
	public String responsibility;

	public String getCharacter() {
		return character;
	}

	public void setCharacter(String character) {
		this.character = character;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
    public void display() {
		System.out.println("My name is "+character+" and my responsibility is "+responsibility);
	}
	
		
	
	

}
