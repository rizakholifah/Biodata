public class Biodata{
    public static void main(String[] args){
        String NamaDepan = "Riza ";
        String NamaTengah = "Kholifah ";
        String NamaBelakang = "Akwan";
        String Tempat = "Tangerang, ";
        int Tanggal = 05 ;
        int Bulan = 12 ;
        int Tahun = 1999 ;
        String strip = "-";
        double umur = 20;
        String alamat = "Bumi Puspiptek Asri Sektor 3i Nomor 24, Pagedangan, Tangerang";


        System.out.println("Nama   : "+NamaDepan+NamaTengah+NamaBelakang);
        System.out.println("TTL    : "+Tempat+Tanggal+strip+Bulan+strip+Tahun);
        System.out.println("Umur   : "+umur+" Tahun");
        System.out.println("Alamat : "+alamat);

    }
}