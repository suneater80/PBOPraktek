public class Soall {
    public static void main(String[] args) {
        byte angka1 = 125;
        byte angka2 = 6;
        byte hasil = (byte) (angka1 + angka2);

        System.out.println("hasil 1 "+hasil);
    }
}

/*  Awalnya saya bingung mengapa hasilnya malah -125, saya mengira kesalahan dalam menulis kode
 *  setelah saya cari tau dan baca" ternyata ini karena byte hanya memiliki rentang -128 hingga 127
 *  di java saat operasi aritmatika pada tipe yg lebih kecil dari byte(seperti byte dan short), maka akan di operasikan dalam int
 *  jadi angka1 dan angka2 dioperasikan dalam int dan menghasilkan 131, tapi setelah itu di casting kembali ke byte.
 *  tapi karena rentangnya tadi ada masalah, 131 dalam binet 32bit adalah 00000000 00000000 00000000 10000011. saat di casting ke byte
 *  hanya 8 bit terakhir yang diambil yaitu 10000011, dan ketika di representasikan dengan two complement menjadi -125
 * karena bit paling depan adalah 1 yang menandakan negative.
 */