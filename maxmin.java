/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       int max=0;
       int min=arr[0];
       for(int i=0;i<size;i++){
           if(arr[i]>max){
               max=arr[i];
           }
           if(arr[i]<min){
               min=arr[i];
           }
           
           
       }
       System.out.println("Max="+max);
       System.out.print("Min="+min);
    }
}