import java.util.Objects;

// Menambahkan "extends Sortable"
public class Employee extends Sortable {
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    public Employee(String n, double s, int day, int month, int year) {
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getHireYear() {
        return hireyear;
    }

    public void raiseSalary(double byPercent) {
        salary *= 1 + byPercent / 100;
    }

    public void print() {
        System.out.println("Nama: " + name + ", Gaji: " + salary + ", Tahun Masuk: " + getHireYear());
    }

    // Implementasi method compare yang harus ada karena extends Sortable
    // Method ini membandingkan gaji dari objek saat ini dengan objek lain (b)
    @Override
    public int compare(Sortable b) {
        Employee eb = (Employee) b; // Casting dari Sortable ke Employee
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }
}