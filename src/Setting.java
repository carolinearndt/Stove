
/*
 * Caroline Arndt
 * Christopher Matthes
 */

public enum Setting {
	OFF ("---"), LOW ("--+"), MEDIUM ("-++"), HIGH ("+++");
	
	private String setting;
	
	
	Setting (String setting){
		this.setting = setting;
	}
	
	public int convertToInt() {
		switch (setting) {
		case "---":
			return 0;
		case "--+":
			return 1;
		case "-++":
			return 2;
		default:
			return 3;
			
		}
	}
	
	public String toString() {
		return setting;
	}
	
	
}
