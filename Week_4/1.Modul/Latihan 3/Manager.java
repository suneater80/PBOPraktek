public class Manager extends Employee {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }
    
    // Manager mendapat kenaikan gaji + bonus
    @Override
    public void raiseSalary(double byPercent) {
        // Ambil tahun sekarang untuk menghitung bonus
        int currentYear = java.time.Year.now().getValue();
        double bonus = 0.5 * (currentYear - hireYear());
        super.raiseSalary(byPercent + bonus);
    }
    
    public String getSecretaryName() {
        return secretaryName;
    }
}