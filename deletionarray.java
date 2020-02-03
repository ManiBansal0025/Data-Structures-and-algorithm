import java.util.*;
class deletionarray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the position of element u want to delete");
		int position = sc.nextInt();
		for(int i =position; i<9;i++){
			arr[i] = arr[i+1];
		}
		for (int k=0;k<9 ;k++ )
		{
			System.out.print(arr[k]+" ");
		}
	}
}
