import java.util.*;
public class prob8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] per = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks: ");
            phy[i] = sc.nextInt();
            if (phy[i] < 0) { i--; continue; }
            System.out.print("Enter Chemistry marks: ");
            chem[i] = sc.nextInt();
            if (chem[i] < 0) { i--; continue; }
            System.out.print("Enter Maths marks: ");
            math[i] = sc.nextInt();
            if (math[i] < 0) { i--; continue; }
            per[i] = (phy[i] + chem[i] + math[i]) / 3.0;
            if (per[i] >= 90) grade[i] = "A";
            else if (per[i] >= 75) grade[i] = "B";
            else if (per[i] >= 50) grade[i] = "C";
            else grade[i] = "D";
        }
        for (int i = 0; i < n; i++)
            System.out.println("Physics: " + phy[i] + " Chemistry: " + chem[i] + " Maths: " + math[i] + " %: " + per[i] + " Grade: " + grade[i]);
    }
}
