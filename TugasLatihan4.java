import java.util.Scanner;

public class TugasLatihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan usia Anda: ");
        int usia = sc.nextInt();
        String kategori;
        
        if (usia >= 65) {
            kategori = "Lansia"; 
        } else if (usia >= 20) {
            kategori = "Dewasa";
        } else if (usia >= 13) {
            kategori = "Remaja";
        } else if (usia >= 0) {
            kategori = "Anak";
        } else kategori = "Input tidak valid";

        System.out.println("Usia Anda " + usia + " tahun dan Anda dikategorikan sebagai " + kategori);
    }
}




