import java.util.*;
public class MaxMinArr {
  
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
 int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Max no is: " + max);


        
         int min = numbers[0];
        for (int i = 1; i < size; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Min no is: " + min);
    }
}