
public class Operator {

	public static void main(String[] args) {
		
		int sum=0;
		for( int i=0 ; i<50 ; i++)
		{
			if(i % 2 == 0) {
				sum = sum+i;
			}
		}
		
		System.out.println("The sum of 50 odd numbers are:"+sum);

	}

}
