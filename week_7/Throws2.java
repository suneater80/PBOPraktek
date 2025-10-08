public class Throws2 {
    public static void test(int n) throws NullPointerException, ArithmeticException {
        if (n < 0) {
            throw new NullPointerException("ini adalah NullPointerException");
        } else if (n == 0) {
            throw new ArithmeticException("ini adalah ArithmeticException");
        }
    }
    public static void main(String[] args) {
        try {
            //test(-10); // baris ini akan menimbulkan eksepsi NullPointerException
            test(0); // baris ini akan menimbulkan eksepsi ArithmeticException
        } catch (Exception x) {
            System.out.println("eksepsi ditangkap disini");
            System.out.println(x.getMessage());
        }
        System.out.println("statemen setelah blok try catch");
    }
}
