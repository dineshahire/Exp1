import java.util.Scanner;

public class Exp1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Employee ID, Name, Basic Salary: ");
        int id = scanner.nextInt();
        String name = scanner.next();
        double salary = scanner.nextDouble();

        double hra = salary * 0.15;
        double da = salary * 0.10;
        double gross = salary + hra + da;

        System.out.println("ID: " + id + "\nName: " + name + "\nSalary: " + salary + "\nHRA: " + hra + "\nDA: " + da + "\nGross: " + gross);

        scanner.close();
    }
}
