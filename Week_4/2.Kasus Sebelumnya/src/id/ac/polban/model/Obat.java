package id.ac.polban.model;

public class Obat{
    private String nama;
    private int stock;

    //Construction
    public Obat(String nama, int stock){
        this.nama = nama;
        this.stock = stock;
    }

    //Getter and Setter
    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama =  nama;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock =  stock;
    }

    //Method mengurangi stock barang
    public void kurangiStock(int jumlah){
        if (stock >= jumlah){
            stock -= jumlah;
        } else{
            System.out.println(nama + " Stock obat sudah habis");
        }
    }
}