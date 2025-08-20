import java.util.*;
public class prob7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            double h, w;
            do {
                System.out.print("Enter height (m) of person " + (i + 1) + ": ");
                h = sc.nextDouble();
            } while (h <= 0);
            do {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                w = sc.nextDouble();
            } while (w <= 0);
            double bmi = w / (h * h);
            personData[i][0] = h;
            personData[i][1] = w;
            personData[i][2] = bmi;
            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        for (int i = 0; i < n; i++)
            System.out.println("Height: " + personData[i][0] + " Weight: " + personData[i][1] + " BMI: " + personData[i][2] + " Status: " + status[i]);
    }
}
