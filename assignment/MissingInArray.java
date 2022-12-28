package week1.day2.assignment;

import java.util.Arrays;

public class MissingInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		
		//System.out.println(arr.length);
		//System.out.println(arr[1]);
		
		Arrays.sort(arr);
		
		
		for (int i = arr[0]; i <= arr.length; i++) {
			
			//System.out.println(arr[i]);
			if(i!=arr[i-1]) {
				System.out.println("Missing number is "+i);
				break;
			}
		}
	}
	}


