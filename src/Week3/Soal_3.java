package Week3;
import java.util.*;

public class Soal_3 {

	public static void main(String[] args) { 
		Scanner Scan = new Scanner(System.in);
		String hitung = Scan.nextLine();
		String readString[] = hitung.split("\\s+");
		
		int A = Integer.parseInt(readString[0]);
		int B = Integer.parseInt(readString[2]);
		int hasil;

	if(1 <= A && B <= 1000){
		    if(readString[1].equals("+")){
		    	hasil = A + B;
		        System.out.println(hasil);
		    }else if(readString[1].equals("-")){
		    	hasil = A - B;
		        System.out.println(hasil);        
		    }else if(readString[1].equals("/")){
		    	hasil = A/B;
		        System.out.println(hasil);        
		    }else if(readString[1].equals("*")){
		    	hasil = A*B;
		        System.out.println(hasil);        
		    }else if(readString[1].equals("%")){
		    	hasil = A%B;
		    	System.out.println(hasil);
		    }
		}else{
		    ;System.out.print("tidak ditemukan operator yang dimaksudkan");
		}
	}
}