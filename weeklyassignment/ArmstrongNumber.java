package weeklyassignment;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		int temp=num;
		int sum=0;
		
		while(temp>0) {
			int digit=temp%10;
			sum=sum+(digit*digit*digit);
			temp=temp/10;
			
		}
		if(sum==num) {
			System.out.println(num + "is armstrong number");
			
		}else {
			System.out.println(num + "is not armstrong number");
		}

	}

}
