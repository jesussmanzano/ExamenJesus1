import java.util.Scanner;

public class LocalDate {

	static int i;
	public static void main(String[] args) {
	
		String[] cads = new String[2];
		int i = 0;
		
		for(String s: cads) {
			cads[i].concat("index" + i);
			i++;
		}
		
		for(i = 0; i<cads.length; i++) {
			System.out.println(cads[i]);
		}
		
	}
}
