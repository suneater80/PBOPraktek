public class FloatingPoint {
    public static void main(String[] args) {
        double x = 92.98;
        int nx = (int) Math.round(x);   // math.round(x) hasilnya adalah long, ini berguna untuk casting ke int
        System.out.println("nilai nx: " + nx);
    }
}


/*  double(64 bit) adalah versi kapasitas besar dari float(32 bit) 
 * dari info ini bit mereka sama seperti long dan int, nah math.round()
 * nah dikarenakan dia double maka math.round akan otomatis ubah ke long
 * jika tidak ada (int) maka akan error karena long tidak dapat masuk otomatis ke int
 * jika x bertipe int maka math.round() akan mengubahnya ke int. 
 * o ya math.round() juga membulatkan bilangannya ke bilangan terdekat, dalam kasus ini 92.98 dibulatkan menjadi 93
*/