import java.util.*;

public class sparsearray
{
    
    public static ArrayList<Integer> matchingStrings(List<String> stringList, List<String> queries) 
    {
          ArrayList<Integer> results= new ArrayList<>();  
          for(int i=0;i<queries.size();i++)
          {
            int count=0;
            for(int j=0;j<stringList.size();j++)
            {
                if(queries.get(i).equals(stringList.get(j)))
                {
                    count++;
                }
            }
            results.add(count);
          }
          return results;
    

}

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> stringList=new ArrayList<>();
        for(int i =0; i<n;i++)
        {
            stringList.add(sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        ArrayList<String> queries=new ArrayList<>();
        for(int i=0;i<q;i++)
        {
            queries.add(sc.nextLine());
        }
    ArrayList<Integer> results = matchingStrings(stringList, queries);
     for (int result : results) {
            System.out.println(result);
        }
        sc.close();
    }
    
}


        
        
        
        
        
        
        
        
    