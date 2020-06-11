package Arrays.RandomW3Resource;

public class AddAllPrime {
    public static void main(String[] args)
    {
        int[] arr={3,4,5,6,7,8,9};
        int flag=0;
        int sum=0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=2;j<=arr[i];j++)
           {
               if(arr[i]%j!=0)
               {
                   flag=0;
                   continue;

               }
               else
               {
                   flag=1;
                   break;
               }
           }
           if(flag==0) {
               sum = sum + arr[i];
           }
       }
       System.out.println(sum);
    }
}
