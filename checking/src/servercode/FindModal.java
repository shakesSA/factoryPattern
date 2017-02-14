package servercode;

import java.util.HashMap;

public class FindModal {
	
	public void FindModal(){
		
	}
	
	public static void main(String args[]) {
		
		int[] input = {4,5,4,7,9,20,7,3,2,4,5,10,3,2,2,2,3,23};
		
		HashMap<Integer, Integer> modal = new HashMap<Integer, Integer>();
		int count = 0;
		int max = 0;
		int modalNumber = 0;
		
		for(int i = 0; i < input.length; i++){
			
			if(modal.get(input[i]) != null)
			{
				count = modal.get(input[i]);
				count = count + 1;
				modal.put(input[i], count);
				if(count > max)
				{
					modalNumber = input[i];
					max = count;
				}
			} 
			else
			{
				modal.put(input[i], 1);
			}
		}
		
		System.out.println("Modal number - " + modalNumber);
	}

}
