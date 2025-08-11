package labsession240425;
//Abstract class
abstract class Bill {
 String customerName;
 // Constructor
 public Bill(String customerName) {
     this.customerName = customerName;
 }
 public abstract void generateBill();
}
class ElectricityBill extends Bill {
 private int unitsConsumed;
 private static final double RATE_PER_UNIT = 20.6;

 public ElectricityBill(String customerName, int unitsConsumed) {
     super(customerName);
     this.unitsConsumed = unitsConsumed;
 }

 //Override
 public void generateBill() {
     double amount = unitsConsumed * RATE_PER_UNIT;
     System.out.println("Customer: " + customerName);
     System.out.println("Units Consumed: " + unitsConsumed);
     System.out.println("Amount to Pay: ₹" + amount);
 }
}
class WaterBill extends Bill {
 private int litersUsed;
 private static final double RATE_PER_LITER = 8.9;
 public WaterBill(String customerName, int litersUsed) {
     super(customerName);
     this.litersUsed = litersUsed;
 }
 //Override
 public void generateBill() {
     double amount = litersUsed * RATE_PER_LITER;
     System.out.println("Customer: " + customerName);
     System.out.println("Liters Used: " + litersUsed);
     System.out.println("Amount to Pay: ₹" + amount);
 }
}

public class Bills {
 public static void main(String[] args) {
     Bill CurrentBill = new ElectricityBill("kishore", 9876);
     Bill WaterBill = new WaterBill("PJ", 500);

     CurrentBill.generateBill();
     WaterBill.generateBill();
 }
}
