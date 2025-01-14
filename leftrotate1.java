import java.util.*;
public class leftrotate1 
{
    public static void main(String args[])
    {
Scanner sc=new Scanner(System.in);
int size=sc.nextInt();
int arr[]=new int[size];
for(int i=0; i<size; i++)
{
    arr[i]=sc.nextInt();
}
int k=sc.nextInt();
for(int i=0; i<k; i++)
{
    int temp=arr[0],j;
for(j=0; j<arr.length-1; j++)
{
    arr[j]=arr[j+1];
}

arr[j]=temp;
}

for(int i=0; i<arr.length; i++)
System.out.print(arr[i]+ " ");
    
    sc.close();
}
    
}
