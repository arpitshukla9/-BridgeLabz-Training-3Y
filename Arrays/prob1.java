package Arrays.Level2;
public class prob1 {
    public static void main(String[] args) {
        int[] bonus = {1000, 1200, 1100, 900, 950, 1050, 1150, 980, 1020, 1080};
        int[] salary = {50000, 52000, 51000, 49000, 49500, 50500, 51500, 49800, 50200, 50800};
        int[] newSalary = {51000, 53200, 52100, 49900, 50450, 51550, 52650, 50780, 51220, 51880};

        int totalBonus = 0;
        int totalOldSalary = 0;
        int totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
    }
}
