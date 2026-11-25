public class ChallengeA {
    public static void main(String[] args) {
        int[][] a = {
                {3, 8, 2, 5},
                {10, 4, 9, 7},
                {1, 6, 12, 3}
        };

        int maxSum = 0;
        int maxRowIndex = 0;

        for (int i = 0; i < a.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                rowSum += a[i][j];
            }

            if (i == 0 || rowSum > maxSum) {
                maxSum = rowSum;
                maxRowIndex = i;
            }
        }

        System.out.println("Row with largest sum: Row " + maxRowIndex + " (Sum: " + maxSum + ")");
    }
}
