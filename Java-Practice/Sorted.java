import java.util.Scanner;


public class Sorted{

static void operation(int arr[]){
    
    for(int i=0; i<arr.length-1; i++){
        if (arr[i] > arr[i + 1]) {
           System.out.println("NOT Sorted");
             return;
        }
    }
     System.out.println("Sorted");
}
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the size:");
  int n = sc.nextInt();

  int arr[] = new int[n];
   System.out.println("Enter the elements:");
  for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
  }
  operation(arr);
}
}