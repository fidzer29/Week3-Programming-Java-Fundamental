package Week3;
import java.util.Scanner;

public class Soal_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Hasil;
		String SatukanAngka;
		long Lampu ;

		for(int i =0;i<2;i++) {
			
			Scanner Scan = new Scanner(System.in);
			SatukanAngka = Scan.nextLine();
			
			String[] Convert = SatukanAngka.split("[ ]+");
			Hasil = Convert[0] + Convert[1] + Convert[2] + Convert[3];
			Lampu = Long.parseLong(Hasil);
			
			Lampu = 999999;
			
			if(Lampu % 5 != 0 ){
				System.out.println("Berhenti");
			}else{
				System.out.println("Jalan");
			}
			System.out.println();
		}
	}

}
