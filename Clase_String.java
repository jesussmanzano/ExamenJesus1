
public class Clase_String {
	
		public static void main(String[] args) {
			
			String s1 = "Java";
			String s2 = "Java";
			StringBuider sb1 = new StringBuider();
			sb1.append("Ja").append("va");
			System.out.println(s1 == s2);
			System.out.println(s1.equals(s2));
			System.out.println(sb1.toString() == s1);
			System.out.println(sb1.toString().equals(s1));
		}

}

/*
 *A. true is printed out exactly once.
 *B. true is printed out exactly twice.
 *C. true is printed out exactly three times.
 *D. true is printed out exactly four times.
 *E. The code does not compile. ( Correct)
 *
 *
 * */
 