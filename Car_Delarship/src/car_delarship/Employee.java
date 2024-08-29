package car_delarship;

public class Employee {
	
	 public void handleCustomer(Customer cus,boolean finance, Vehicle vehicle) {
		 
		 if( finance==true) {
			 double loanAmount = vehicle.getPrice() - cus.getCashOnHand();
			 runCreditHistory(cus,loanAmount);
		 }
		 else if(vehicle.getPrice()<=cus.getCashOnHand()) {
			 //paid in cash
			 processTransaction(cus, vehicle);
		 }
		 else {
			 System.out.println("Customer will need more money to purchase vehicle: "+vehicle);
		 }
	 }
	 
	 public void runCreditHistory(Customer cus, double loanAmount) {
		 System.out.println("Ran credit history for customer.......");
		 System.out.println("Customer has been approved to purchase the vehicle");
	 }
	 
	 public void processTransaction(Customer cus, Vehicle vehicle) {
		 System.out.println("Customer has purchased  the vehicle: "+vehicle+" for the price "+vehicle.getPrice());
	 }

}
