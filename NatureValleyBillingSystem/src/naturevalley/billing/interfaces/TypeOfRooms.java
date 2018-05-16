package naturevalley.billing.interfaces;

public enum TypeOfRooms {
	STANDARD(2500),
	DELUXE(3500),
	COTTAGE(5500);
	
	private int action;

	public int getAction() {
		return action;
	}
	
	private TypeOfRooms(int action){
		this.action = action;
	}
}
