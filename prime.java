import java.util.Scanner;

public class prime {

	public static void Prime(int Number)
	{
		if(Number>2)
		{
			int temp=0;
			System.out.println("2");
			for(int i=3;i<=Number;i++)
			{
				temp=0;
				for(int j=2;j<i;j++ )
				{
					if(i%j==0)
						temp=1;
				}
				if(temp==0)
					System.out.println(i);
			}
		}
		else if(Number==2)
			System.out.println("2");
		else
			System.out.println("Wrong Input");
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int No1=sc.nextInt();
		Prime(No1);
		sc.close();
	}

}
