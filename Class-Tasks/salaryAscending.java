import java.util.*;

public class salaryAscending {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        int salary[] = new int[n];

        System.out.println("Enter salaries:");

        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        // Sorting in ascending order
        Arrays.sort(salary);

        System.out.println("Salaries in ascending order:");

        for (int i = 0; i < n; i++) {
            System.out.println(salary[i]);
        }

        sc.close();
    }
}