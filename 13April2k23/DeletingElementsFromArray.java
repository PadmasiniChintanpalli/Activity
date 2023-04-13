package arrays;
import java.util.Scanner;

public class DeleteElementAtSpecificPosition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[20];
		System.out.println("Enter the no of elements you want to enter");
		int size = sc.nextInt();
		
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<size;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Array before deletion");
		for(int i=0;i<size;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
		
		System.out.println("Enter the element want to be deleted:");
		int element = sc.nextInt();
		int pos = -2;
		//to find the position of the element
		for(int i=0; i<size; i++) 
		{
			if(a[i]==element) {
				pos = i;
			}

		}
		if(pos==-2) 
		{
			System.out.println("Element does not exist.");
		}
		else 
		{
			for(int i=pos;i<size;i++)
			{
				a[i] = a[i+1];
			}
			for(int var:a) {
				System.out.print(var+" ");
			}
		}
		
	}

}
