//BUBBLE SORT

// import java.util.Scanner;

// public class Sorting {
//   public static void PrintArray(int arr[]){
// for(int i=0;i<=arr.length-1;i++){
//       System.out.print(arr[i]+" ");
//   }
//   }
//   public static void main(String[] args) {
//  Scanner sc = new Scanner(System.in);

//   System.out.println("Enter size:");
//   int size = sc.nextInt();
//   int arr[] = new int[size];


//   System.out.println("Give inputs:");
// for(int i=0;i<size;i++){
//   arr[i] = sc.nextInt();
// }

//       for(int i=0;i<=arr.length-1;i++){
//         for(int j=0;j<arr.length-i-1;j++){
//           if(arr[j] > arr[j+1]){
//             int temp = arr[j];
//             arr[j]= arr[j+1];
//             arr[j+1]=temp;
//           }
//         }
//       }
//      PrintArray(arr);  
// }
// }


import java.util.Scanner;

public class Sorting {
    public static void PrintArray(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // For clean output
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Give inputs:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Selection Sort logic
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap only if needed
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

            
        }

        System.out.println("Sorted array:");
        PrintArray(arr);
    }
}

