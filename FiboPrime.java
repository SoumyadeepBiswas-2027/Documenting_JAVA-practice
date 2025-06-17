//below code gives fibonacci in an array and then generates prime from that fibonacci array and print them in an another array!


public class FiboPrime {
    public static void main(String[] args) {
        int x = 0, y = 1;
        int[] a = new int[11]; // Store first 11 Fibonacci numbers (0 to 10)
        int[] b = new int[11]; // To store prime Fibonacci numbers
        int bIndex = 0;

        a[0] = x;
        a[1] = y;
        System.out.print(x + " " + y + " ");

        for (int i = 2; i <= 10; i++) {
            int sum = x + y;
            a[i] = sum;
            x = y;
            y = sum;
            System.out.print(sum + " ");
        }
        System.out.println();

        // Store and print prime Fibonacci numbers
        for (int i = 0; i <= 10; i++) {
            int num = a[i];
            int count = 0;
            if (num > 1) {
                for (int j = 1; j <= num; j++) {
                    if (num % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    b[bIndex++] = num;
                }
            }
        }

        System.out.print("Prime Fibonacci numbers: ");
        for (int i = 0; i < bIndex; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
