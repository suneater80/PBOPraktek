import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input stringnya
        String A = sc.next();
        String B = sc.next();

        // 1.jumlah panjang A + B
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2.perbandingan lexicographically (pada kamus)
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3.menjadikan huruf pertama Kapital
        String capA = A.substring(0,1).toUpperCase() + A.substring(1);
        String capB = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(capA + " " + capB);

        sc.close();
    }
}

/*
 * untuk perbandingan pada kamus, sebelumnya saya pernah membandingkan huruf pada C, saya berpikir untuk mengubahnya ke nilai ASCII
 * kemudian dibandingkan, tetapi akan ada looping untuk index"nya. nah karena java memiliki lebih banyak modul include dari pada C
 * saya mencoba mencari apakah di java ada modul untuk membandingkan kata, dan saya menemukan compareTo yang membandingkan index per index
 * sistemnya disini seperti membandingkan angka, misalnya aabaa lebih kecil dari aaabb, walau jika asciinya dijumlahkan maka aabaa lebih besa
 * tetapi karena di perbedaan pertama dia lebih kecil maka aaabb dinilai lebih besar
 * #ralat : perbedaan dari kamus ya wkwk, baru inget:)
 * 
 * pada Kapitalisasi huruf pertama saya juga berpikir menjadikannya ascii dan menguranginya 32 karena segitu perbedaan huruf kecil dan kapitalnya
 * karna agak ribet jadi saya mencari lagi apakah di java ada yang lebih cepat dan menemukan toUpperCase. dimana huruf pertama d uppercase 
 * kemudian digabung dengan sisa huruf lain
 */