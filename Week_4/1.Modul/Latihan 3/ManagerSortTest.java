public class ManagerSortTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        // array berisi campuran Employee dan Manager
        staff[0] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[1] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("--- Data Campuran Sebelum Diurutkan ---");
        for (Employee e : staff) {
            e.print();
        }

        // Method sort
        Sortable.shell_sort(staff);

        System.out.println("\n--- Data Campuran Setelah Diurutkan (berdasarkan gaji) ---");
        for (Employee e : staff) {
            e.print();
        }
    }
}