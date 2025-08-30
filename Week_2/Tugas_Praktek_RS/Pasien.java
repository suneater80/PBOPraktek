public class Pasien{
    private String nama;
    private String penyakit;

    //Constructor
    public Pasien(String nama, String penyakit){
        this.nama = nama;
        this.penyakit = penyakit;
    }

    //Getter and Setter
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getPenyakit(){
        return penyakit;
    }

    public void setPenyakit(String NIM){
        this.penyakit = penyakit;
    }
    
}