public class Kategori {
    public Kategori() {}

    public void displayTeknologi() {
    String[] judul = {"Sistem Operasi Modern", "Rekayasa Perangkat Lunak", "Deep Learning Concepts", "Cyber Security Defense", "Jaringan Komputer Global"};
    String[] author = {"Andi Wijaya & Budi Santoso", "Clara Hart", "David Lee & Kevin Miles", "Elsa Putri", "Michael Chen & Andi Wijaya"};
    int[] tahun = {2019, 2018, 2021, 2020, 2017};
    int[] halaman = {420, 385, 510, 295, 460};

    System.out.println("Teknologi: ");
    for (int i = 0; i < judul.length; i++) {
        Author penulis = new Author(author[i]);
        Buku buku = new Buku(judul[i], tahun[i], halaman[i], penulis);
        buku.displayJudul();  
    }
}


    public void displayFilsafat() {
        String[] judul = {"Eksistensialisme Modern", "Etika dan Moralitas Global", "Logika Kritis & Analisis", "Filsafat Ilmu Pengetahuan", "Pemikiran Tokoh Dunia"};
        String[] author = {"Dr. Samuel R", "Prof. Helena Wiratama & Dr. Gustaf Y", "Nico Pramana", "Dr. Karen Widjaya", "Prof. Albert S & Dr. Hannah Cole"};
        int[] tahun = {2014, 2019, 2017, 2016, 2021};
        int[] halaman = {320, 402, 298, 355, 440};

        System.out.println("Filsafat: ");
        for (int i = 0; i < judul.length; i++) {
            Author penulis = new Author(author[i]);
            Buku buku = new Buku(judul[i], tahun[i], halaman[i], penulis);
            buku.displayJudul();
        }
    }

    public void displaySejarah() {
        String[] judul = {"Peradaban Dunia", "Sejarah Nusantara", "Revolusi Industri Eropa", "Perang Dunia & Dampaknya", "Jejak Kolonialisme Asia"};
        String[] author = {"Dr. Yusuf Hakim", "Prof. Made Santika", "Dr. Colin Rogers & Dr. Peter Smith", "Dr. Hanura Wijaya", "Dr. Michael Tan & Dr. Louis Chen"};
        int[] tahun = {2015, 2021, 2018, 2017, 2022};
        int[] halaman = {510, 440, 389, 425, 470};

        System.out.println("Sejarah: ");
        for (int i = 0; i < judul.length; i++) {
            Author penulis = new Author(author[i]);
            Buku buku = new Buku(judul[i], tahun[i], halaman[i], penulis);
            buku.displayJudul();
        }
    }

    public void displayAgama() {
        String[] judul = {"Makna Pengabdian", "Sejarah Peradaban Islam", "Spiritualitas Modern", "Filsafat Ketuhanan", "Kearifan Lintas Iman"};
        String[] author = {"Ust. Rahman Idris", "Prof. Hamzah Al-Jabbar", "Pastor Daniel & Bhante Surya", "Dr. Alvino Hadi", "Imam Faisal & Pastor Michael"};
        int[] tahun = {2013, 2020, 2019, 2016, 2022};
        int[] halaman = {275, 520, 360, 410, 395};

        System.out.println("Agama: ");
        for (int i = 0; i < judul.length; i++) {
            Author penulis = new Author(author[i]);
            Buku buku = new Buku(judul[i], tahun[i], halaman[i], penulis);
            buku.displayJudul();
        }
    }

    public void displayPsikologi() {
        String[] judul = {"Mental Health Awareness", "Psikologi Perkembangan Anak", "Behavior & Cognitive Study", "Terapi Emosional Modern", "Personality & Social Behavior"};
        String[] author = {"Dr. Karina S", "Dr. Felicia Amara", "Dr. Michael Stanford & Dr. Reina Lee", "Dr. Fathur Rahman", "Prof. Livia Tan & Dr. Andrew Park"};
        int[] tahun = {2021, 2017, 2018, 2019, 2022};
        int[] halaman = {412, 350, 478, 390, 508};

        System.out.println("Psikologi: ");
        for (int i = 0; i < judul.length; i++) {
            Author penulis = new Author(author[i]);
            Buku buku = new Buku(judul[i], tahun[i], halaman[i], penulis);
            buku.displayJudul();
        }
    }

    public void displayPolitik() {
        String[] judul = {"Geopolitik Asia", "Diplomasi Global", "Ideologi Dunia Modern", "Kekuasaan & Kebijakan Publik", "Strategi Pertahanan Negara"};
        String[] author = {"Dr. Adrian Yusuf", "Dr. Diana Kusuma & Dr. Lionel Park", "Prof. Harun Jatmiko", "Dr. Fabian Utama", "Dr. Hong Lee & Prof. Andrei Sergei"};
        int[] tahun = {2016, 2022, 2018, 2017, 2021};
        int[] halaman = {399, 450, 380, 470, 520};

        System.out.println("Politik: ");
        for (int i = 0; i < judul.length; i++) {
            Author penulis = new Author(author[i]);
            Buku buku = new Buku(judul[i], tahun[i], halaman[i], penulis);
            buku.displayJudul();
        }
    }

    public void displayFiksi() {
        String[] judul = {"Langit Tanpa Bintang", "Petualangan Dunia Ajaib", "Misteri Rumah Kabut", "Legenda Negeri Akar", "Cyber City Chronicles"};
        String[] author = {"Raka Pradana", "Liona Grace", "K. Mahendra & S. Alvaro", "Vera Kencana", "Dr. Kevin Sparks & Ayla Moon"};
        int[] tahun = {2015, 2019, 2021, 2017, 2023};
        int[] halaman = {320, 388, 450, 410, 530};

        System.out.println("Fiksi: ");
        for (int i = 0; i < judul.length; i++) {
            Author penulis = new Author(author[i]);
            Buku buku = new Buku(judul[i], tahun[i], halaman[i], penulis);
            buku.displayJudul();
        }
    }

}