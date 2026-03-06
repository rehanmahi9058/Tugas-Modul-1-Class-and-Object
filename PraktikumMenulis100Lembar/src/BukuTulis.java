public class BukuTulis {

    private int lembar;
    private double kata;
    private double halamanPerHari;
    private double hari;

    
    BukuTulis(int lembar,double kata){
        this.lembar = lembar;
        this.kata = kata;

        this.halamanPerHari = this.kata/200;

        hari = menghitungHari(this.lembar, this.halamanPerHari);
    }

    private double menghitungHari(int lembar,double halaman){
        return lembar/halaman;
    }

    public void displayHari(){
        System.out.printf("Total hari untuk menghabiskan satu buku adalah : %.0f",hari);
    }
}
