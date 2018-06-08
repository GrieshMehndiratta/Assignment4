import java.util.Scanner;

public class Even {

	public static void even(int Number)
	{
		for(int i=0;i<=Number;i+=2)
			System.out.println(i);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int No1=sc.nextInt();
		even(No1);
		sc.close();
	}

}
