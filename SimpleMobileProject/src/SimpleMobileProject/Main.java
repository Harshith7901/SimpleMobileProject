package SimpleMobileProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		DeskPhone myPhone = new DeskPhone("123456");
//		myPhone.powerOn();
//		myPhone.callPhone("123456");
//		myPhone.answer();

		MobilePhone myPhone = new MobilePhone("12345");
		myPhone.powerOn();
		myPhone.callPhone("12345");
		myPhone.answer();
	}

}
