package tugasPBO2;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 52. Siapa kamu : untuk menampilkan identitas siapa kamu
 */

public class SiapaKamu {
	 public static void main(String[] args) {
	        
	        Manusia x = new Manusia();
	        Dosen y = new Dosen();
	        Mahasiswa z = new Mahasiswa();
	        
	        y.setNip("41227829930");
	        System.out.println("NIP DOSEN : "+y.getNip());
	        y.siapaKamu();
	        y.mengajarApa();        
	        System.out.println("");
	        z.setNim("10110269");
	        z.siapaKamu();
	        z.kelasApa();
	        
	        
	        
	    }
}
