import java.util.Scanner; 
public class ReverseArray { 
  public static void main(String args[]){ 
    Scanner sc = new Scanner(System.in); 
    System.out.print("Enter size of array:"+" "); 
    int n = sc.nextInt(); 
 
    System.out.println("Enter elements:"); 
    int[] arr = new int[n]; 
    for(int i=0;i<arr.length;i++){ 
      arr[i]= sc.nextInt(); 
    } 
    //                                       USING FOR LOOP

    
    // for(int i=0 ;i<n-1 ;i++){ 
    //   for(int j=n-1-i; j>i; j--){ 
    //     int temp = arr[i]; 
    //     arr[i]= arr[j]; 
    //     arr[j]= temp; 
    //     break; 
    //   } 
    // } 

    //                                         USING WHILE 


    int i=0; 
    int j=n-1;
    while( i <  j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
    }
    //                          we can show output in 2 ways one is normal amd other is using for each 
    
    
    System.out.println("Reversed array:"); 
    // for(i=0;i<arr.length;i++){ 
    //   System.out.println(arr[i]); 
    // } 
    for(int val:arr) System.out.println(val);

  } 
} 
   