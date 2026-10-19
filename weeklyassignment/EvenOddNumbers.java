package weeklyassignment;

public class EvenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Even Numbers");
		
		for(int i=1;i<=20;i++) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		System.out.println("\nOdd Numbers");
		for(int i=1;i<=20;i++) {
			if(i%2!=0)
			{
				System.out.println(i+" ");
			}
		}

	}

}
