/*
 * Caroline Arndt
 * Christopher Matthes
 */

public class Burner {
	public enum Temperature { 
		
		BLAZING ("VERY HOT! DON'T TOUCH"), HOT("CAREFUL"), WARM("warm"), COLD("cool");
		
		private String temperature;
		
		Temperature (String temperature){
			this.temperature = temperature;
		}
		
		public String toString() {
			return temperature;
		}
		
		};
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
	
	// For ease of comparing setting vs temperature
	private int convertToInt() {
		switch (myTemperature) {
		case BLAZING:
			return 3;
		case HOT:
			return 2;
		case WARM:
			return 1;
		default:
			return 0;
		}
	}
	private void increaseTemp() {
		switch(myTemperature) {
		case HOT:
			myTemperature = Temperature.BLAZING;
			break;
		case WARM:
			myTemperature = Temperature.HOT;
			break;
		case COLD:
			myTemperature = Temperature.WARM;
			break;
		default:
			// If the temp is blazing dont increment
			break;
		}
	}
	
	private void decreaseTemp() {
		switch(myTemperature) {
		case BLAZING:
			myTemperature = Temperature.HOT;
			break;
		case HOT:
			myTemperature = Temperature.WARM;
			break;
		case WARM:
			myTemperature = Temperature.COLD;
			break;
		default:
			// If the temp is COLD dont decrement
			break;
		}
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
				break;
			}
			// compare setting and temperature, return new temperature
			// compare and change if necessary
			
			if (mySetting.convertToInt() == convertToInt()) {
				return;
			}
			else {
				timer = TIME_DURATION;
				if (mySetting.convertToInt() > convertToInt()) {
					increaseTemp();
				}
				else {
					decreaseTemp();
				}
			}
		}
		
	}
	
	
	public void display () {
		System.out.println(mySetting + "....." + getMyTemperature());
		
	}
	
	
	
	
	
	
}
