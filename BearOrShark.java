
public class BearOrShark {

	public static void main(String[] args) {
		int luck = 10;
		if((luck>10 ? luck++: --luck)<10) {
			System.out.print("Bear");
		}
		if(luck<10) System.out.print("Shark");

	}

}

/*
 * What is the output of the following program?
 * 	A. Bear
	B. Shark
	C. BearShark (Correct)
	D. The code will not compile because of line 4.
	E. The code will not compile because of line 6.
	F. The code compiles without issue but does not produce any outp
 */