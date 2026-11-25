public class Practice4 {
    public static void main(String[] args) {
        int[][] a = {
                {11, 22, 33},
                {44, 55, 66},
                {77, 88, 99}
        };

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
