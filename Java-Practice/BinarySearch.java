import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter size:");
    int size = sc.nextInt();
    System.out.println("Enter target:");
    int target = sc.nextInt();


    int[] arr = new int[size];
    System.out.println("Enter Elements:");
    for(int i=0; i < size; i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);

// 1 2 3 4 5 6 
    int low=0; 
    int high= size - 1;
    // int mid = (low+high)/2;
    while(low <= high){
      int mid = (low+high)/2;
      if(arr[mid] > target){
        high=mid-1;
      }else if(arr[mid] < target){
        low=mid+1;
      }else{
        System.out.println("Element Found at:"+ mid);
        return;
      }
    }
    System.out.println("Element Not Found");

  }
}
