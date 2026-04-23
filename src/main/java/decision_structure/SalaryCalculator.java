package decision_structure;

import java.util.Scanner;

public class SalaryCalculator {
    static void main() {
        double salary = 1000;
        double bonus = 250;
        int quota = 10;

        System.out.println("How many sales did the employee get?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales > quota) {
            salary = salary + bonus;
        }
        System.out.println("Salary: " + salary);
    }
}
