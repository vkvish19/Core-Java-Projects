package naturevalley.billing.interfaces;

public interface RoomBillComponent {
	public final double tax = 0.12;
	public final double EXTRA_PERSON_CHARGE = 500.00;
	public final double FOOD_CHARGE = 800.00;
	
	public float calculateBill();
}
