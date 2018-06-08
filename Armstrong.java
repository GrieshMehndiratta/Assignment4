import java.util.Scanner;

public class Armstrong {

	public static int armstrong(int Number)
	{
		int Number1=0,r,temp=1,i=0;
		while(Number!=0)
		{
			r=Number%10;
			Number=Number/10;
			Number1=(Number1)+(r*temp);
			temp=temp*10;
			i++;
		}
		Number=Number1;
		Number1=0;
		while(Number!=0)
		{
			r=Number%10;
			Number=Number/10;
			Number1= Number1+(int)(Math.pow(r,i));
			
		}
		return Number1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int No1=sc.nextInt();
		int No2=armstrong(No1);
		if(No1==No2)
		System.out.println("YES Armstrong");
		else
			System.out.println("Not Armstrong");
		sc.close();

	}

}
