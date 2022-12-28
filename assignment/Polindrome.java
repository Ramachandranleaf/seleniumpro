package week1.day2.assignment;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=34343;
		int n=number;
		int sum=0;
		for(;n!=0;n/=10)
		{
			int a=n%10;
			sum=(sum*10)+a;
			
		}
		if(sum==number)    
			System.out.println(number+ " is palindrome number");    
		else    
			System.out.println(number+ " is not a palindrome number");    

	}

	}


