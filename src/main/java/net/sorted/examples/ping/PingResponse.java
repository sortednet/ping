package net.sorted.examples.ping;

public class PingResponse {
	private String message;

	public PingResponse() {
		
	}
	
	public PingResponse(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
