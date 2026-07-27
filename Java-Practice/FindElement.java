import java.util.*;

public class FindElement{

  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
     System.out.println("Enter size:");
    int size = sc.nextInt();
    int[] arr = new int[size];

    System.out.println("Enter Elements:");
    for(int i=0; i < size; i++){
      arr[i] = sc.nextInt();
    }

     System.out.print("Enter the number u want to search:");
     int num = sc.nextInt();
     for(int i = 0; i < size; i++){
     if(num == arr[i]){
       System.out.print("Num found at index:" + i);
     }}
  }
}