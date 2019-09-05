
public class Burner {
	public enum Temperature { BLAZING, HOT, WARM, COLD};
	private Temperature myTemperature;
	private Setting mySetting;
	private int timer;
	public static final int TIME_DURATION = 2;
	
	public Temperature getMyTemperature() {
		return myTemperature;
	}

	public Burner() {
		super();
		this.myTemperature = Temperature.COLD;
		this.mySetting = Setting.OFF;
		this.timer = 0;
	}
	
	public void plusButton () {
		switch (mySetting) {
		case OFF :
			mySetting = Setting.LOW;
			timer = TIME_DURATION;
			break;
		case LOW :
			mySetting = Setting.MEDIUM;
			timer = TIME_DURATION;
			break;
		case MEDIUM :
			mySetting = Setting.HIGH;
			timer = TIME_DURATION;
			break;
		default:
			break;
		}
	
	}
	
	public void minusButton () {
		switch (mySetting) {
		case HIGH :
			mySetting = Setting.MEDIUM;
			timer = TIME_DURATION;
			break;
		case MEDIUM :
			mySetting = Setting.LOW;
			timer = TIME_DURATION;
			break;
		case LOW :
			mySetting = Setting.OFF;
			timer = TIME_DURATION;
			break;
		default:
			break;
		}
	}
	
	public void updateTemperature() {
		while(timer > 0) {
			timer --;
			if (timer > 0) {
				continue;
			}
			// compare setting and temperature, return new temperature
			// compare and change if necessary
			
		}
		
	}
	
	
	public void display () {
		System.out.println(mySetting + "....." + getMyTemperature());
		
	}
	
	
	
	
	
	
}
