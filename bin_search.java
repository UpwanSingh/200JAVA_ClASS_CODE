import java.util.*;
import java.util.Arrays;
public class bin_search {
    public static void main(String args [])
    {
        int n ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        Arrays.sort(arr);
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched: ");
        int x = sc.nextInt();
       int  low = 0;
       int  high = n-1;
       while(low <= high)
       {
           int mid = (low + high) / 2;
           if(arr[mid] == x)
           {
               System.out.println("Element found at index: " + mid);
               return;
           }
           else if(arr[mid] < x)
           {
               low = mid + 1;
           }
           else
           {
               high = mid - 1;
           }
       }
       System.out.println("Element not found in the array.");

    }
}

        
