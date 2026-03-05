public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double kecepatan;
    private double kecepatanms;
    private double waktu;
    private double sekon;
    private double jarakm;
    private double jarakkm;

    public void setNoPlat(String s){
        noPlat = s;
    }

    public void setWarna(String s){
        warna = s;
    }
    
    public void setManufaktur(String s){
        manufaktur = s;
    }
    
    public void setKecepatan(double i){
        kecepatan = i;
        kecepatanms = rubahKecepatan(i);
    }

    public void setWaktu(double d){
        waktu = d;
        sekon = rubahSekon(d);
        jarakm = hitungJarak(kecepatanms,sekon);
        jarakkm = hitungJarak(waktu,kecepatan);
    }

    private double rubahSekon (double d){
        return d*3600;
    }

    private double rubahKecepatan (double i){
        return i/3.6;
    }

    private double hitungJarak (double v, double t){
        return v * t;
    }
    
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek "+manufaktur);
        System.out.println("mempunyai nomor plat "+noPlat);
        System.out.println("serta memililki warna "+warna);
        System.out.printf("dan mampu menempuh kecepatan %.0f km/h atau %.2f m/s \n",kecepatan,kecepatanms);
        System.out.printf("dalam waktu %.1f jam atau %.0f detik \n",waktu,sekon);
        System.out.printf("jarak yang telah ditempuh adalah %.0f m atau %.2f km/h \n",jarakm,jarakkm);
    }
}
