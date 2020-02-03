import java.util.*;
class insertarray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int k=0;k<9 ;k++ )
		{
			System.out.print(arr[k]+" ");
		}
	}
}
