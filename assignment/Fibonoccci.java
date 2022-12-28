package week1.day2.assignment;

public class Fibonoccci {

	public static void main(String[] args) {	
		
		// TODO Auto-generated method stub
		
		int range=8; int firstNum=0; int secondNum=1; int sum;
		System.out.println("Fibonocci numbers from 0 to " +range);
		
		for (int i = 0; i <= range; i++) {
			
			System.out.println(firstNum);
			
			sum=firstNum+secondNum;
			
			firstNum=secondNum;
			secondNum=sum;
					
			
		}

	}

}
