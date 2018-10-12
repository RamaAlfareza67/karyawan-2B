public class Programer extends Karyawan{
	public void setGaji(int gaji){
		if(gaji<=90){
			System.out.println("selamat gaji anda sebanyak = "+gaji);
		}else{
			System.out.println("maaf gaji anda sudah maksimal");
		}
	}
}