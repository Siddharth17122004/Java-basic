import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//get row and col size from user
		System.out.println("Enter number of rows/row size ");
		int row=sc.nextInt();
		System.out.println("Enter number of columns/column size ");
		int col=sc.nextInt();
		//declare Array
		int arr[][]=new int[row][col];
		//get array elements
		System.out.println("Enter array elements: ");
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		//print array elements
		System.out.println("The array elements are: ");
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        System.out.print(" "+arr[i][j] );
		    }
		    System.out.println();
		}
		
	}
}