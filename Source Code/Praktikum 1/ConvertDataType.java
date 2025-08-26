public class ConvertDataType {
    static short methodOne(long l) {
        int i = (int) l;    // long menjadi int
        return (short) i;   // int jadi short
    }

    public static void main(String[] args) {
        double d = 10.25;                // disini d bertipe double
        float f = (float) d;             // d yang bertipe double telah menjadi float
        byte b = (byte) methodOne((long) f);    // (long) f disini d yang bernilai float diubah lagi menjadi long
                                                // nah di 1 baris yang diatas begini perubahannya float -> long -> int -> short -> byte
        System.out.println(b);
    }
}


/*saya cukup paham dengan kodenya, tapi baru kali ini melihat konversi sebanyak ini
 * intinya si d double di konversi hingga menjadi bertipe byte kemudian nilainya disimpan di b
 * nah si d double yang menjadi float presisinya berkurang nih karna perbedaan bit, tapi karna disini hanya 10.25 masi aman lah ya
 * ketika menjadi long hilang deh ,25 nya dan dibulatkan menjadi 10, begitu seterusnya hingga di byte tetap 10
 * jadi output b adalah 10
 */