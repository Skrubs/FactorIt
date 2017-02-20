package application.data;

import java.util.ArrayList;

public class DataStorage {
	
	public static ArrayList<Integer> factoredList = new ArrayList<>();
	public static ArrayList<Integer> previouslyFactoredNumbers = new ArrayList<>();
	public static long factoredNumber = 0;
	
	public static void setFactoredNumber(long num){
		factoredNumber = num;
	}

}
