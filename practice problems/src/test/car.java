package test;

public class car {

	public String twoChar(String str, int index) {
		if (index == str.length()-1 ||
		index < 0 ||
		index >= str.length()) {
		return str.substring(0,2);
		}else{
		return str.substring(index, index+2);
		}
	}
}
