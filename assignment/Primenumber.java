package week1.day2.assignment;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=13;
		boolean flag=false;
		for (int i = 2; i <=a/2 ; i++) {
			if (a%i==0) {
				flag=true;
				break;
			}
			}
		if(!flag)
		{
			System.out.println(a+" is a prime number");
		}
		else {
			System.out.println(a+" is not a prime number");
		}
	}

	}


