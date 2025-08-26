public class Constants2 {
    public static final double CM_PER_INCH = 2.54;  // public static final
    public static void main(String[] args) {
        double paperWidth = 8.5;
        double paperHeight = 11;

        System.out.println("Paper size in centimeters: " +
            paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}


/*Public bisa diakses dari mana saja(kayak variabel global mungkin) dari class lain dan package lain
 * Static artinya variabel milik class bukan milik objek, tidak perlu membuat objek untuk mengaksesnya
 * Final nilainya hanya dapat didefinisikan 1x, seperti di deklarasi kemudian tidak dapat diubah ubah lagi
 * 
 * kemarin public dan static udah dijelasin di teori, final cukup mudah buat dipahami
 * cuma saya masi kurang paham dengan static, waktu dijelasin saya berpikir maksudnya adalah variabel lokal(seperti di C)
 * tapi setelah dicari cari lagi, saya menemukan maksud seperti diatas, lumayan menambah pemahaman saya, tapi mungkin karena saya belum
 * pernah menggunakan objek/paham dengan lebih baik, jadi saya masi kurang tau apa maksudnya. apakah objek itu pointer?
 */