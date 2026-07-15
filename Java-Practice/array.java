import java.util.*;

public class array{
  public static void main(String args[]){
    System.out.println("Enter the size of the array:");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    //input of array 
    int array[] = new int[size];

    //input part below
    System.out.println("Enter numbers:");
    for (int i = 0; i < size ; i++) {
        array[i] = sc.nextInt();}

    //loop to print actual array
    System.out.println("Actual array:");
    for (int i = 0; i < size ; i++) {
        System.out.print( array[i]);}

    //loop to print reversed array
    System.out.print("Reversed array:");
    for (int i = size-1 ; i>=0 ; i--) {
       System.out.print(" "+array[i]);
    }
    
  }
}