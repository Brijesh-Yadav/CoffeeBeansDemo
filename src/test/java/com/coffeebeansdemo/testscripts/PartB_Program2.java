package com.coffeebeansdemo.testscripts;

public class PartB_Program2 {
	
	public static void main(String []args){
		String word = "Bangalore is in india";
		String [] arr = word.split(" ");
		for(int i=0; i<arr.length; i++){
			String arrword = arr[i];
			returnRepword(arrword, arrword);
		}
	}
	
	public static int returnRepeatedStr(char charc, String stat){
		char [] arr = stat.toCharArray();
		int nm = 0;
		for(int i=0; i<arr.length; i++){
			if(charc == (arr[i])){
				nm++;
			}
		}
		if(nm>1){
			System.out.println("charc '"+charc +"' is repated with "+nm+" times with '"+stat+"' word");
		}
		return nm;
	}
	
	public static int returnRepword(String wrd, String wrd2){
		char [] arr = wrd.toCharArray();
		int nm = 0;
		for(int i=0; i<arr.length; i++){
			nm = returnRepeatedStr(arr[i], wrd2);
		}
		return nm;
	}

}
