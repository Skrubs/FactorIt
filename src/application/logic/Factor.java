package application.logic;

import application.data.DataStorage;

public class Factor {
	
	
	public Factor(){
		
	}
	
	public void numberToFactor(){
		
	}
	
		
	public static void factor(long num){
		for(int i = 1; i <= num; i++){
			if(num%i == 0){
				DataStorage.factoredList.add(i);
			}
		}
		System.out.println(DataStorage.factoredList);
	}

}
