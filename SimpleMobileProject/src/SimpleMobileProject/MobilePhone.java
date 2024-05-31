package SimpleMobileProject;

public class MobilePhone implements Telephone {
	private String myNumber;
	private boolean isRinging;
	private boolean isPowerOn;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		isPowerOn = true;
		System.out.println("phone powerd on");
	}

	@Override
	public void dail(String phoneNumber) {
		// TODO Auto-generated method stub
		System.out.println("Now ringing " + phoneNumber + " on deskphone");
	}

	@Override
	public void answer() {
		// TODO Auto-generated method stub
		if (isRinging && isPowerOn) {
			System.out.println("Answering the phone");
			isRinging = false;
		} else {

		}
	}

	@Override
	public boolean callPhone(String phoneNumber) {
		// TODO Auto-generated method stub
		if (phoneNumber == myNumber && isPowerOn) {
			isRinging = true;
			System.out.println("Phone ringing");
		} else {
			System.out.println("Either wrong number entered or phone is off");
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		// TODO Auto-generated method stub
		return isRinging;
	}
}