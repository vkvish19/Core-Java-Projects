package naturevalley.billing;

import naturevalley.billing.interfaces.RoomBillComponent;
import naturevalley.billing.interfaces.TypeOfRooms;

public class RoomDetails implements RoomBillComponent {

	private int billId;
	private String customerName;
	private String typeOfRoom;
	private int noOfExtraPersons;
	private int noOfDaysOfStay;
	public static int counter = 1;
	
	
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getTypeOfRoom() {
		return typeOfRoom;
	}
	public void setTypeOfRoom(String typeOfRoom) {
		this.typeOfRoom = typeOfRoom;
	}

	public int getNoOfExtraPersons() {
		return noOfExtraPersons;
	}
	public void setNoOfExtraPersons(int noOfExtraPersons) {
		this.noOfExtraPersons = noOfExtraPersons;
	}

	public int getNoOfDaysOfStay() {
		return noOfDaysOfStay;
	}
	public void setNoOfDaysOfStay(int noOfDaysOfStay) {
		this.noOfDaysOfStay = noOfDaysOfStay;
	}

	public RoomDetails(){
		
	}
	
	public RoomDetails(String customerName, String typeOfRoom, int noOfExtraPersons, int noOfDaysOfStay) {
//		super();
		this.billId = counter++;
		this.customerName = customerName;
		this.typeOfRoom = typeOfRoom;
		this.noOfExtraPersons = noOfExtraPersons;
		this.noOfDaysOfStay = noOfDaysOfStay;
	}
	
	public boolean validateNoOfExtraPerson(){
		if(noOfExtraPersons >= 0 && noOfExtraPersons <= 2){
//			System.out.println("validateNoOfExtraPerson() TRUE");
			return true;
		}
		System.out.println("No of Extra Persons per Room entered: " +noOfExtraPersons +" is INVALID...");
		System.out.println("No of Extra Persons per Room can be Maximum Two (2)");
		return false;
	}
	
	public boolean validateNoOfDaysOfStay(){
		if(noOfDaysOfStay >= 1 && noOfDaysOfStay <= 15){
//			System.out.println("validateNoOfDaysOfStay() TRUE");
			return true;
		}
		System.out.println("User entered no of Days Stay: " +noOfDaysOfStay +" is INVALID...");
		System.out.println("Number of Days Stay needs to minimum One (1) Day to maximum Fifteen (15) days");
		return false;
	}
	
	public boolean validateTypeOfRoom(){
		
		for(TypeOfRooms tor: TypeOfRooms.values()){
			if(typeOfRoom.equalsIgnoreCase(tor.name())){
//				System.out.println("validateTypeOfRoom() TRUE");
				return true;
			}
		}

		/*if( typeOfRoom.equalsIgnoreCase("Standard") || typeOfRoom.equalsIgnoreCase("Deluxe") 
				|| typeOfRoom.equalsIgnoreCase("Cottage") ){
			
		}*/
		System.out.println("User Entered Room Type: " +typeOfRoom +" is INVALID...");
		System.out.println("It needs to be either of STANDARD, DELUXE or COTTAGE");
		return false;
	}
	@Override
	public float calculateBill() {
		boolean roomTypeOK = validateTypeOfRoom();
		boolean stayDaysOK = validateNoOfDaysOfStay();
		boolean extraPersonsOK = validateNoOfExtraPerson();
		
		if( roomTypeOK && stayDaysOK && extraPersonsOK){
			int roomBaseFare = 0;
			double totalBill = 0.0f;
			for(TypeOfRooms tor: TypeOfRooms.values()){
				if(typeOfRoom.equalsIgnoreCase(tor.name())){
					roomBaseFare = tor.getAction();
				}
			}
			
			totalBill = (noOfDaysOfStay*roomBaseFare) + noOfDaysOfStay*(RoomBillComponent.FOOD_CHARGE)
					+(RoomBillComponent.EXTRA_PERSON_CHARGE * noOfExtraPersons);
//			System.out.println("BEFORE TAX: "+totalBill);
			
			totalBill += (RoomBillComponent.tax * totalBill);
//			System.out.println("AFTER TAX: "+totalBill);
			
//			System.out.println("TOTAL BILL CALCULATED.");
			return (float)totalBill;
		}
		return -1;
	}

}
