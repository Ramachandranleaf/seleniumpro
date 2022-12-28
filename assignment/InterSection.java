package week1.day2.assignment;

public class InterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] first={3,2,11,4,6,7};	
		int[] second={1,2,8,4,9,7};
		
		//System.out.println(a.length);
		
		//System.out.println(b.length);
		for(int i=0;i<first.length;i++)
		{
			for(int j=0;j<second.length;j++)
			{
				if(first[i]==second[j])
				{
				System.out.println(first[i]);
				}
			}
		}
	}

	}


