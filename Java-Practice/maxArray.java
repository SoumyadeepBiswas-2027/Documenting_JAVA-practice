import java.util.*;

class maxArray {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size:");
    int size = sc.nextInt();

    System.out.println("Enter Numbers");
    int[] array = new int[size];
    for(int i=0; i<array.length ;i++){
     array[i] = sc.nextInt();
    }

    System.out.println("The max element is:");
    int max = array[0];
     for(int i=0; i<array.length ;i++){
      if(array[i] > max){
        max = array[i];
      }
      // System.out.println(max);
        }    System.out.println(max);

    
        }
    }