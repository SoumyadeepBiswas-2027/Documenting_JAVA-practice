import java.util.*;

public class Duplicate {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int[] elements = new int[size];
    for (int i = 0; i < size ; i++) {
         elements[i] = sc.nextInt();
    }
    for(int i=0; i < size; i++){
      for(int j=i+1; j < size; j++){
        if(elements[i]==elements[j]){
          System.out.print("Duplicate element is:" +elements[i]);
        }
      }
    }
  }
}
