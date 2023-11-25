package tugasPBO2;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 52. Siapa kamu : untuk menampilkan identitas siapa kamu
 */

public class Dosen extends Manusia{
    
    private String nip;
    private String mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27tahun sedang mengajar mata kuliah PBO");
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Dosen");
    }
    
    
    
}
