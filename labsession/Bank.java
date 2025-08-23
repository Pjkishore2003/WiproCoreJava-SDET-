package labsession;
class Payment {
 public void pay() {
     System.out.println("Payment method selected");
 }
}
class CreditCard extends Payment {
 public void pay() {
     System.out.println("Payment successs using Credit Card");
 }
}
class UPI extends Payment {
 public void pay() {
     System.out.println("Payment success using UPI");
 }
}
class NetBanking extends Payment {
 public void pay() {
     System.out.println("Payment success using Net Banking");
 }
}
public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Payment p1 = new CreditCard();
	     Payment p2 = new UPI();
	     Payment p3 = new NetBanking();
	     p1.pay(); 
	     p2.pay(); 
	     p3.pay();
	}

}
