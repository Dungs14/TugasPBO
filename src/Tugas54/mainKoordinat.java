package Tugas54;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 54.Koordinat : untuk menampilkan warna dan sumbu x
 */

public class mainKoordinat {
	 public static void main(String[] args) {
	       
	        int x = 10;
	        int y = 4;
	        String warna = "Jingga";
	        
	        WarnaKoordinat j = new WarnaKoordinat(x, y, warna);
	        
	        j.setNamaWarna(warna);
	        j.setX(x);
	        j.setY(y);
	        
	        System.out.println("Warna Koodinat : "+j.getNamaWarna());
	        System.out.println("Koordinat Sumbu x : "+j.getX()+", y : "+j.getY());
	        
	    
	    }
}
