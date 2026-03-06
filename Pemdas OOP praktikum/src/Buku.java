public class Buku {
    private String judul;
    private int tahun;
    private int halaman;
    private Author author;

    Buku(){}

    Buku(String judul,int tahun, int halaman, Author penulis){
        this.judul = judul;
        this.tahun = tahun;
        this.halaman = halaman;
        this.author = penulis;
    }

    public void displayJudul(){
        System.out.println("Buku: " + judul);
        author.displayAuthor();
        System.out.println("Halaman: " + halaman);
        System.out.println("Tahun Penerbitan: " + tahun);
        System.out.println("------------------");
    }
}
