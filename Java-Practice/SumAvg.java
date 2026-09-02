import java.util.*;

 class SumAvg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size:");
    int n = sc.nextInt();
    
    System.out.println("Enter numbers:");
    int[] arr = new int[n];
    for(int i=0; i<n; i++){
       arr[i] = sc.nextInt();
    }

    int sum = 0;
    for(int i=0; i<n; i++){
       sum += arr[i];
    }
    System.out.println("The sum is:"+" "+sum);
    int avg = sum/n;
    System.out.println("The avg is:"+" "+avg);

  }
 }