public class SalarySlip {
    public static void main(String[] args) {
        String[] names = {"Arpit", "Amol Sir", "Akash Sir"};
        int[] salaries = {50000, 60000, 70000};

        for (int i = 0; i < names.length; i++) {
            double hra = salaries[i] * 0.2;
            double da = salaries[i] * 0.1;
            double netSalary = salaries[i] + hra + da;

            if (salaries[i] > 50000) {
                netSalary -= netSalary * 0.1; 
            }

            System.out.println("\nSalary Slip for " + names[i]);
            System.out.println("Basic Salary: ₹ " + salaries[i]);
            System.out.println("HRA: ₹ " + hra);
            System.out.println("DA: ₹ " + da);
            System.out.println("Net Salary: ₹ " + netSalary);
        }
    }
}
