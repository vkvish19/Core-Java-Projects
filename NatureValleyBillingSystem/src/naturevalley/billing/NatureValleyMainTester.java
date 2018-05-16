package naturevalley.billing;

public class NatureValleyMainTester {

	public static void main(String[] args) {
		RoomDetails rd1 = new RoomDetails("Vishu", "STANDARD", 12, 5);
		RoomDetails rd2 = new RoomDetails("NRN", "COTTAGE", 1, 10);
		RoomDetails rd3 = new RoomDetails("Sundar", "STANDARD", 0, 7);
//		RoomDetails rd1 = new RoomDetails("Vishu", "STANDARD", 2, 5);
//		RoomDetails rd1 = new RoomDetails("Vishu", "STANDARD", 2, 5);

		
		float billAmount1 = rd1.calculateBill();
		if(billAmount1 == -1){
			System.out.println("**********SOMETHING IS WRONG IN GIVEN DATA**********");
			System.out.println("**********PLEASE CHCEK THE LOGS ABOVE**********");
		}
		else{
			System.out.println("********** NATURE VALLEY RESORT ****************");
			System.out.println("Bill ID			: " +rd1.getBillId());
			System.out.println("Customer Name		: " +rd1.getCustomerName());
			System.out.println("No. of Days Stay	: " +rd1.getNoOfDaysOfStay());
			System.out.println("No. of Extra Persons	: " +rd1.getNoOfExtraPersons());
			System.out.println("TOTAL BILL		: Rs." +billAmount1 +"/-");
			System.out.println("********** THANK YOU _/\\_ VISIT AGAIN **********");
		}

		
		float billAmount2 = rd2.calculateBill();
		if(billAmount2 == -1){
			System.out.println("**********SOMETHING IS WRONG IN GIVEN DATA**********");
			System.out.println("**********PLEASE CHCEK THE LOGS ABOVE**********");
		}
		else{
			System.out.println("********** NATURE VALLEY RESORT ****************");
			System.out.println("Bill ID			: " +rd2.getBillId());
			System.out.println("Customer Name		: " +rd2.getCustomerName());
			System.out.println("No. of Days Stay	: " +rd2.getNoOfDaysOfStay());
			System.out.println("No. of Extra Persons	: " +rd2.getNoOfExtraPersons());
			System.out.println("TOTAL BILL		: Rs." +billAmount2 +"/-");
			System.out.println("********** THANK YOU _/\\_ VISIT AGAIN **********");
		}
		
		float billAmount3 = rd3.calculateBill();
		if(billAmount3 == -1){
			System.out.println("**********SOMETHING IS WRONG IN GIVEN DATA**********");
			System.out.println("**********PLEASE CHCEK THE LOGS ABOVE**********");
		}
		else{
			System.out.println("********** NATURE VALLEY RESORT ****************");
			System.out.println("Bill ID			: " +rd3.getBillId());
			System.out.println("Customer Name		: " +rd3.getCustomerName());
			System.out.println("No. of Days Stay	: " +rd3.getNoOfDaysOfStay());
			System.out.println("No. of Extra Persons	: " +rd3.getNoOfExtraPersons());
			System.out.println("TOTAL BILL		: Rs." +billAmount3 +"/-");
			System.out.println("********** THANK YOU _/\\_ VISIT AGAIN **********");
		}
	}

}
