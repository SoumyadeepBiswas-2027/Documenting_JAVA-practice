//Enter an array from user ,then find the index of a specific element from the array!(#linear search)
import java.util.*;
public class linearSearch {

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

  System.out.println("Enter size:");
  int size = sc.nextInt();
  int numbers[] = new int[size];


  System.out.println("Give inputs:");
for(int i=0;i<size;i++){
  numbers[i] = sc.nextInt();
}

 System.out.println("output:");
for(int i=0;i<size;i++){
  System.out.println(numbers[i]);

}
 System.out.println("Enter number you want to find:");
 int s= sc.nextInt();
 for(int i=0;i<size;i++){
 if(s==numbers[i]){
  System.out.println("Number found in index: " +i);
 }
}
}
}
