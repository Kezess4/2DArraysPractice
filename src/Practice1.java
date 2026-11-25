// Мисс Ажар, так получилось что я только на прошлой паре узнал что мы должны прикреплять в osc, а не на паре показывать, поэтому ничего не прикреплял в osc до этой работы, извините

public class Practice1 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
