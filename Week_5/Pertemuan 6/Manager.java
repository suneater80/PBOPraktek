import java.util.Calendar;
import java.util.GregorianCalendar;

public class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        // Memanggil constructor dari superclass (Employee)
        super(n, s, d, m, y);
        secretaryName = "";
    }

    // Meng-override method raiseSalary dari kelas Employee
    @Override
    public void raiseSalary(double byPercent) {
        // Menghitung tahun kerja untuk bonus
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - getHireYear());
        
        // Memanggil method raiseSalary asli dari Employee, lalu menambahkan bonus
        super.raiseSalary(byPercent + bonus);
    }

    public String getSecretaryName() {
        return secretaryName;
    }
    
    public void setSecretaryName(String name) {
        this.secretaryName = name;
    }
}