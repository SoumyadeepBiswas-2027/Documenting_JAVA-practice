import java.util.Scanner;
import java.util.Arrays;

public class DutchNationalFlag {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] arr = new int[size];
    System.out.println("Enter elements:");
    for (int i = 0; i<=arr.length-1; i++) {
        arr[i]=sc.nextInt();
    }
   Arrays.sort(arr);
   for(int i=0;i<=arr.length-1;i++){
    if(arr[i]==0||arr[i]==1||arr[i]==2){
      System.out.print(arr[i]+" ");
    }
   }
  }
}
