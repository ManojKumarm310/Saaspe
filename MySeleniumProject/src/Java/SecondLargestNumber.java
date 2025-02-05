package Java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,0,3,9,7,15,18,18};
		
		int first= 0;//Integer.MIN_VALUE;
		int second = 0;
		
		//Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}else if(arr[i]>second && arr[i]!=first) {
				second = arr[i];
			}
		} 
		System.out.println("Second largest no is"+ second);
	}

}
