package Tugas56;

/*
 * Nama Kelompok : -Dava Pratma			(221106042987)
 * 				  -Fahreza Aldi Wildan  (221106042853)
 * Kelas : Reguler A
 * Program 56. umur barang antik : untuk menampilkan umur barang antik 
 */

public class Radio extends BarangAntik{
	    
	    private String name;
	    
	    public Radio(int umur){
	       super(umur);
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    
}
