package SimpleMobileProject;

public interface Telephone {
	/**
	 * Power On dial a number answer phone call call another phone is ringing
	 */

	void powerOn();

	void dail(String phoneNumber);

	void answer();

	boolean callPhone(String phoneNumber);

	boolean isRinging();

}
