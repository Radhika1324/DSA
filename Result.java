
import java.util.*;

class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int[] reverseArray(int[] A) {
        
    int n=A.length;
    int reversedArray[]=new int[n];
    for (int i =0; i<n; i++)
    {
        reversedArray[i]=A[n-1-i]; 
    }
    return reversedArray;   

    }


    public static void main(String[] args)
    {
    Scanner sc = new Scanner (System.in);
    int n=sc.nextInt();
    int A[]= new int[n];
    for(int i=0;i<n;i++)
    {
        A[i]= sc.nextInt();
    }
    int reversed[]= Result.reverseArray(A);
    for(int i=0; i<reversed.length; i++)
    {    System.out.print(reversed[i]);
        if(i<reversed.length-1)
        {
            System.out.print(" ");
        }
    
   
     } 
     sc.close();
    }
}
    
    
    
    
    
    
    
    
    