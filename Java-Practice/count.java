import java.util.*;

class count {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size:");
    int size = sc.nextInt();

    System.out.println("Enter Numbers");
    int[] array = new int[size];
    for(int i=0; i<array.length ;i++){
     array[i] = sc.nextInt();
    }
    System.out.println("Enter Target:");
     int target = sc.nextInt();

     int  count =0;
     for(int i=0; i<array.length; i++){
      if(target == array[i]){
        count++;  
      }
     }System.out.println("the number of times the target element occured is:-"+" "+count);
     
        }
    }