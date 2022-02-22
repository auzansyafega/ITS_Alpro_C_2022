import java.util.Scanner;
public class JavaLibs5026211179 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang teman, kenalan dulu yuk");
        
        System.out.println("Nama kamu siapa?");
        String nama = input.nextLine();

        System.out.println("Tahun berapa kamu lahir?");
        int lahir = input.nextInt();
        
        System.out.println("Tahun sekarang?");
        int sekarang = input.nextInt();

        input.nextLine();
        System.out.println("Jenis kelamin kamu apa?");
        String kelamin = input.nextLine();

        System.out.println("Hobi kamu?");
        String hobi = input.nextLine();

        System.out.println("Tinggi badanmu? (dalam meter)");
        double tinggi = input.nextDouble();

        System.out.println("Berat badanmu? (dalam kg)");
        double berat = input.nextDouble();

        input.nextLine();
        System.out.println("Makanan favoritmu?");
        String makanan = input.nextLine();

        System.out.println("Minuman favoritmu?");
        String minuman = input.nextLine();

        System.out.println("Harapanmu tahun ini?");
        String harapan = input.nextLine();

        System.out.println("Ketik selesai");
        String selesai = input.next();

        int umur = sekarang-lahir;
        double massa = berat/(tinggi*tinggi*tinggi);

        System.out.println("Hai "+nama+", Terima kasih sudah meluangkan waktunya.");
        System.out.println("Tahun ini umurmu "+umur+" tahun, semoga umurnya berkah yaa.");
        System.out.println("Tetap semangat yaa dalam menjalani harimu. Aku tau, terkadang kamu lelah, bosan.");
        System.out.println("Kalau lagi bosan, baiknya kamu lakuin hobimu deh, seperti "+hobi+" supaya kamu semangat lagi.");
        System.out.println("Jangan lupa makan yaa. Makan "+makanan+" sama minumnya "+minuman+" dehh, pasti buat kamu tambah semangat.");

        input.nextLine();
        System.out.println("Btw, aku punya fakta unik nih dari dirimu,");
        System.out.println("Mau tau ga fakta unik dari dirimu? (Ketik 'mau' atau 'tidak')");
        String pilihan = input.nextLine();
        if (pilihan.equalsIgnoreCase("mau")){
            System.out.println("Okee, nih aku kasih tau yaa. Ternyata massa jenismu itu "+massa+" kg/m3 looo. Menarik kann?");
        } else{
            System.out.println("Okedeh, kalau gamau juga gapapa :)");
        }
        System.out.println("Oh iya, semoga harapanmu untuk "+harapan+" di tahun ini terwujud yaaa, aamiin!!!");
        System.out.println("Baiklah, sampai juga kita di penghujung. Tetap semangat dan sukses selalu temann!!!");
        System.out.println("Good luck!!");

        System.out.println("Code made by Auzan Taqi Syafega");





    }
}