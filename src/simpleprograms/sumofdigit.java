package simpleprograms;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args)
	{
     Scanner sc=new Scanner(System.in);
     int num,rem, sum=0;
	 System.out.println(" Enter Number: ");
     num=sc.nextInt();
     
     while(num>0)
     {
    	 rem=num%10;
    	 sum=sum+rem;
    	 num=num/10;
     }
		System.out.format("Sum of the digits of Given Number " +sum);
		if(sum%2==0)
		{
			System.out.format("sum is even");
		}
		
		else
		{
			System.out.format("sum number is odd");

		}
	}

}
