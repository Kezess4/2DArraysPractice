public class Practice12 {
    public static void main(String[] args) {
        int[][] a = {
                {85, 90, 78, 92},
                {70, 88, 95, 80},
                {91, 84, 89, 96}
        };

        int classMax = a[0][0];
        int totalSum = 0;
        int totalCount = 0;

        for (int i = 0; i < a.length; i++) {
            int studentSum = 0;
            for (int j = 0; j < a[i].length; j++) {
                studentSum += a[i][j];
                totalSum += a[i][j];
                totalCount++;

                if (a[i][j] > classMax) {
                    classMax = a[i][j];
                }
            }
            double studentAvg = (double) studentSum / a[i].length;
            System.out.println("Student " + i + " average: " + studentAvg);
        }

        double overallAvg = (double) totalSum / totalCount;
        System.out.println("Class maximum: " + classMax);
        System.out.println("Overall average: " + overallAvg);
    }
}
