public class ManagerTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        // staff[1] adalah objek Manager, tetapi bisa disimpan dalam array Employee
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);

        System.out.println("--- Keadaan Awal ---");
        for (Employee e : staff) {
            e.print();
        }

        // Memanggil raiseSalary untuk setiap pegawai
        // Untuk objek Employee, method asli yang dipanggil.
        // Untuk objek Manager, method override yang dipanggil (dengan bonus).
        for (Employee e : staff) {
            e.raiseSalary(5);
        }

        System.out.println("\n--- Setelah Kenaikan Gaji 5% ---");
        for (Employee e : staff) {
            e.print();
        }
    }
}