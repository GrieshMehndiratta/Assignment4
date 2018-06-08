
public class Sort {

public static int[] sort(int arr[])
{
	int temp,flag=0;
	for(int i=0;i<arr.length;i++)
	{
		flag=0;
		for(int j=0;j<arr.length-i-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
			}
		}
		if(flag==0)
			break;
	}
	return arr;
}
	
	public static void main(String[] args) {
		int[] arr = new int[]{1,1,1,1,0,0,1,0};
		int[] arr1=sort(arr);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println(arr1[i]);
		}
	}

}
