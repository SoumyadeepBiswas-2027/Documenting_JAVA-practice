import java.util.Arrays;
import java.util.Scanner;

public class firstOccurence {
  
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

    int low = 0;
    int right = arr.length - 1;
    //int right = arr[size] - 1;
    while(low<=right){
      int mid = (low+right)/2;
      if(arr[mid]>target){
        right = mid-1;
      }else if(arr[mid]<target){
        low = mid +1;
      }else {//System.out.println("Target found at idx:"+mid);
      right = mid-1;
    }
    } System.out.println("first occurence of target found at idx:"+low);
  }
}