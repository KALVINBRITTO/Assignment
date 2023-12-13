package week1.day1;

public class Mobile {
	
	public static void main(String[] args) {
		
		Mobile phone=new Mobile();
		
		phone.makeCall();
		phone.sendMessage();
		phone.shareDocument();
		
	}
	
	public void sendMessage() {
		
		System.out.println("Message has been sent");
	}	
	public void shareDocument() {
		
		System.out.println("Document has been shared");
	}
	public void makeCall() {
		
		System.out.println("calling");
	}

}
