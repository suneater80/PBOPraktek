import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah test case
        int T = input.nextInt();

        for (int i = 0; i < T; i++) {
            try {
                long n = input.nextLong(); // gunakan long agar aman menangani angka yang besar
                System.out.println(n + " can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                    System.out.println("* long");

            } catch (Exception e) {
                // jika angka yang dimasukkan sangat besar dan melebihi long(untuk jaga" aja)
                System.out.println("can't be fitted anywhere");
                input.next(); // skip input yang tidak bisa ditampung
            }
        }
        input.close();
    }
}


/*
 *  makin kesini makin banyak yang ditemui. awalnya saya berpikir untuk membuat looping dan didalamnya cukup di isi dengan if if yang sesuai dengan tipe data
 *  misalnya byte yang memiliki rentang -125 hingga 127 dan begitu seterusnya, ternyata bisa dengan Byte.MIN_VALUE
 *  kemudian saya mendapat pemahaman baru bahwa di java, untuk menangani error input tidak dapat dengan if, tapi dengan try dan catch
 */