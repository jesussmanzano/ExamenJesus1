
public class Egret {
	
	private String color;
	
	public Egret() {
		this("white");
	}
	
	public Egret(String color) {
		color = color;
	}

	
	public static void main(String[] args) {
		Egret e = new Egret();
		System.out.println("Color:" + e.color);

	}

}

/*
 * What is the result of the following program?
 * 	A. Color:
	B. Color:null (Correct)
	C. Color:White
	D. Compiler error on line 4.
	E. Compiler error on line 10.
	F. Compiler error on line 11.
 * */


