import java.util.*;
public class prob9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] per = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                int m;
                do {
                    System.out.print("Enter marks for subject " + (j + 1) + ": ");
                    m = sc.nextInt();
                } while (m < 0);
                marks[i][j] = m;
            }
            per[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (per[i] >= 90) grade[i] = "A";
            else if (per[i] >= 75) grade[i] = "B";
            else if (per[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }
        for (int i = 0; i < n; i++)
            System.out.println("Physics: " + marks[i][0] + " Chemistry: " + marks[i][1] + " Maths: " + marks[i][2] + " %: " + per[i] + " Grade: " + grade[i]);
    }
}
