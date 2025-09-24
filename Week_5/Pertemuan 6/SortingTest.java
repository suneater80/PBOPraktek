public class SortingTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("--- Sebelum Diurutkan ---");
        for (Employee e : staff) {
            e.print();
        }

        // Memanggil method static shell_sort dari kelas Sortable
        Sortable.shell_sort(staff);

        System.out.println("\n--- Setelah Diurutkan Berdasarkan Gaji (Terbesar ke Terkecil) ---");
        for (Employee e : staff) {
            e.print();
        }
    }
}