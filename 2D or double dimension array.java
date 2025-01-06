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
			//print sum
		
		for(int i=0;i<row;i++){
		    int sum1=0;
		    for(int j=0;j<col;j++){
		        sum+=arr[i][j];
		        sum1+=arr[i][j];
		        
		    }
		    System.out.println("The sum of "+i+"th row is "+sum1);
		    
		}
		System.out.println("Total Sum is "+sum);
	
		
	}
}
output:
Enter number of rows/row size 
2
Enter number of columns/column size 
3
Enter array elements: 
1
2
3
4
5
6
The array elements are: 
 1 2 3
 4 5 6
	
The sum of 0th row is 6
The sum of 1th row is 15
Sum is 21

