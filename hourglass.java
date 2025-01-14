
import java.util.*;
public class hourglass {
    public static void main(String[] args)
    {
    Scanner sc= new Scanner (System.in);
    int arr[][]=new int[6][6];
    for(int i=0;i<6;i++)
    {
        for(int j=0;j<6;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }
    int maxSum=Integer.MIN_VALUE;
       for(int row=0;row<4;row++)
       {
        for(int col=0;col<4;col++)
        {
            int sum=arr[row][col]+arr[row][col+1]+arr[row][col+2]+arr[row+1][col+1]+arr[row+2][col]+arr[row+2][col+1]+arr[row+2][col+2];
            if(sum > maxSum)
            {
                maxSum=sum;
            }
        }
       }
    System.out.println(maxSum);
    }
}
    
    
