 
public class TryCatch {

	public static void main(String[] args) {
		
		System.out.print("a");
		try {
			System.out.print("b");
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			System.out.print("c");
		} finally {
			System.out.print("d");
		}
		System.out.print("e");
	}

}

/*
 * A. abe
 * B. abce
 * C. abde
 * D. abcde (Correct)
 * E. The code does not compile.
 * F. An uncaught exception is thrown.
 * 
 * Se imprimen toda la letras una tras otra por que las salidad en pantalla no hacen salto de linea
 * abcde
 * 
 * */
