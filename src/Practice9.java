import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        int[][] a = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == target) {
                    System.out.println("Found at row " + i + ", column " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }

        scanner.close();
    }
}
