import java.util.Scanner;
public class ProcessAName5026211179 {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nama kamu");
        String nama = input.nextLine();
        input.close();

        String[] PisahinNama = nama.split(" ");
        String namaDepan = PisahinNama[0].substring(0,1).toUpperCase();
        String namaBelakang = PisahinNama[PisahinNama.length-1];

        System.out.println("Nama singkatan kamu adalah: "+namaBelakang +", "+ namaDepan+".");

    }
}