import java.util.Scanner;

public class secondMax {

  public static void operation(int arr[]){

    int max = arr[0] ;
    int smax = arr[0];
    for(int i=0;i<arr.length;i++){
      
        if(max < arr[i]) {
            smax = max;      // old max becomes second max
            max = arr[i];    // new max
        }
        if(smax < arr[i] && arr[i] != max) {
            smax = arr[i];
        }
      }
     System.out.println("The maximum element is:"+" "+max);
     System.out.println("The 2nd maximum element is:"+" "+smax);
    }
    
    
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of array:"+" ");
    int n = sc.nextInt();

     System.out.println("Enter elements:");
    int[] arr = new int[n];
    for(int i=0;i<arr.length;i++){
      arr[i]= sc.nextInt();
    }

    operation(arr);
  }
  }