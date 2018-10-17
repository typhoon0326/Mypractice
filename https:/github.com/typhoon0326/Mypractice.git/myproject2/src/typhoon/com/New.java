package typhoon.com;

import java.util.Scanner;

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int num1,num2,num3,t1,t2,t3,a1,a2,a3,b1,b2,b3,total;
		
		 Scanner in = new Scanner(System.in);
		 System.out.print("keying 3 words");
		
		 num1 = in.nextInt();
		 num2 = in.nextInt();
		 num3 = in.nextInt();
		
		 t1 = num1 / 10;
		 t2 = num2 / 10;
		 t3 = num3 / 10;
		 
		 a1 = num1 % 10;
		 a2 = num2 % 10;
		 a3 = num3 % 10;
		 
		 b1 = t1 + a1;
		 b2 = t2 + a2;
		 b3 = t3 + a3;
		
		 
		 total = b1 + b2 +b3;
		 
		 
		 System.out.println(t1);
		 System.out.println(a1);
		 System.out.println(t2);
		 System.out.println(a2);
		 System.out.println(t3);
		 System.out.println(a3);
	     System.out.print(total);
		 
		 
	}

}
