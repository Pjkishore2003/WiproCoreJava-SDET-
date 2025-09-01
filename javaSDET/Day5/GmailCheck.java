package pack5;
class NotGmailException extends Exception {
    public NotGmailException(String message) {
        super(message);
    }
}
public class GmailCheck {
	static void checkGmail(String email) throws NotGmailException {
        if (email == null || !email.endsWith("@gmail.com")) {
            throw new NotGmailException("Not a valid Gmail address.");
        } else {
            System.out.println("Valid Gmail address: " + email);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            String email1 = "Kishore@gmail.com";
            String email2 = "Pj@gmail.com";
            checkGmail(email1);
            checkGmail(email2);
        } catch (NotGmailException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	}

