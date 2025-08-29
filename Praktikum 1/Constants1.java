public class Constants1 {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54; // final
        double paperWidth = 8.5;
        double paperHeight = 11;

        System.out.println("Paper size in centimeters: " +
            paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
    }
}

/* Penjelasan lengkap saya buat di Constants2
 * final artinya nilai tidak dapat diubah, hanya dapat di inisiasi 1x, jika dicoba untuk diubah maka akan error
 * o ya perbedaan outputnya g ada sii, sama aja. jadi klo g baca kodenya g bakal tau apa bedanya, yang membedakannya adalah cara menangani variabelnya
 */