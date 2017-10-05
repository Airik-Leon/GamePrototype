package gameCharacters;

public class player extends gameCharacters {
	String response;
	
	public player() {
		super();
		response = "";
	}
	public player(String name, int healthPoints, String response) {
		super(name, healthPoints);
		this.response = response; 
	}
	
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public void retreat() {
		
	}	
}
