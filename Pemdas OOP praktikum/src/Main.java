import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Nama : Mochammad Raihan Mahi");
        System.out.println("NIM : 255150701111011");
        System.out.println("Kelas : TI B");
        System.out.println();

        System.out.println("Selamat datang di Perpustakaan UB");
        System.out.println();
        System.out.println("Kategori : ");
        System.out.println("1. Teknologi");
        System.out.println("2. Filsafat");
        System.out.println("3. Sejarah");
        System.out.println("4. Agama");
        System.out.println("5. Psikologi");
        System.out.println("6. Politik");
        System.out.println("7. Fiksi");
        System.out.println("8. Tampilkan Semua");
        System.out.println();
        System.out.print("Pilih kategori yang anda inginkan (1-8): ");
        int pilihan = input.nextInt();
        Kategori genre = new Kategori();

        switch(pilihan){
            case 1:
                genre.displayTeknologi();
            break;

            case 2:
                genre.displayFilsafat();
            break;

            case 3:
                genre.displaySejarah();
            break;

            case 4:
                genre.displayAgama();
            break;

            case 5:
                genre.displayPsikologi();
            break;

            case 6:
                genre.displayPolitik();
            break;

            case 7:
                genre.displayFiksi();
            break;

            case 8:
                genre.displayTeknologi();
                genre.displayFilsafat();
                genre.displaySejarah();
                genre.displayAgama();
                genre.displayPsikologi();
                genre.displayPolitik();
                genre.displayFiksi();
            break;
        }

        input.close();
    }
}
