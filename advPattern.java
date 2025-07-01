 //1)print butterfly pattern 
// public class advPattern {
//   public static void main(String args[]){
//     int n=5;
//     //upper half
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=i;j++){
//       System.out.print("*");
//       }
//       int spaces = 2*(n-i);
//        for(int j=1 ;j<=spaces ;j++){
//         System.out.print(" ");
//     } 
//      for(int j=1;j<=i;j++){
//       System.out.print("*");
//       }
//       System.out.println();
  
//     }  
//     //lower half

//      for(int i=n; i>=1; i--){
//       for(int j=1;j<=i;j++){
//       System.out.print("*");
//       }
//       int spaces = 2*(n-i);
//        for(int j=1 ;j<=spaces ;j++){
//         System.out.print(" ");
//     } 
//      for(int j=1;j<=i;j++){
//       System.out.print("*");
//       }
//       System.out.println();
  
//     }
//   }
// }


 //2)print solid rhombus pattern 
//  public class advPattern {
//    public static void main(String args[]){
//     int n=5;

//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=5;j++){
//        System.out.print("*");
//       }
//        System.out.println();
//     }
   
//   }
// }

// //3)print pyramid pattern  of numbers
// public class advPattern {
//    public static void main(String args[]){
//     int n=5;

//     for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//       System.out.print(" ");
//     }
//     //numbers
//      for(int j=1;j<=i;j++){
//       System.out.print(i + " ");
//      }
//       System.out.println();
//     }
//     }
//   }

//4)print palindromic pyramid pattern

// public class advPattern {
//     public static void main(String args[]) {
//         int n = 5;

//         for (int i = 1; i <= n; i++) {
//             // Print spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }

//             // Print decreasing numbers
//             for (int j = i; j >= 1; j--) {
//                 System.out.print(j);
//             }

//             // Print increasing numbers (starting from 2 to avoid repeating center digit)
//             for (int j = 2; j <= i; j++) {
//                 System.out.print(j);
//             }

//             // Move to next line
//             System.out.println();
//         }
//     }
// }



//5)print diamond pattern 
// public class advPattern {
//     public static void main(String args[]) {
//         int n = 4;
// //upper half:-
//         for (int i = 1; i <= n; i++) {
//             // Print spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             //stars
//             for (int j = 1; j <= 2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//           }
//           //lower half:-
//            for (int i = n; i >= 1; i--) {
//             // Print spaces
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             //stars
//             for (int j = 1; j <= 2*i-1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//           }
//         }
//       }


