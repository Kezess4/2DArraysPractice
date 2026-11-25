import java.util.Scanner;

public class Practice8 {
    public static void main(String[] args) {
        int[][] a = {
                {12, 45, 7},
                {30, 18, 52},
                {9, 25, 41}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a threshold number: ");
        int threshold = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > threshold) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than " + threshold + ": " + count);
        scanner.close();
    }
}
