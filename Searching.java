import java.util.Scanner;

class Searching
{
	public static int Search(int[] arr, int number)  {
	    int s = 0;
	    int e = arr.length -1;              
	     
	    for (int i = 0; i < arr.length; i++)   {
	        int m = (e - s)/2;
	        if (arr[i] == number)  {
	            return i;
	        }
	        else if (arr[m] > number)  {
	            e = m - 1;
	        }
	        else    {
	            s = m + 1;
	        }
	    }
	    return 0;
	}
    public static void main(String args[])
    {
        int arr[] = {1,4,6,7,8,9,10};
        Scanner sc=new Scanner(System.in);
		int No1=sc.nextInt();
        int result = Search(arr,No1);
        if (result == 0)
            System.out.println("Element not Found");
        else
            System.out.println("Element found at " + result);
        sc.close();
                                                 
    }
}