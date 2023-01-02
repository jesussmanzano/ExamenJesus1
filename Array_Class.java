import java.util.ArrayList;
import java.util.List;

public class Array_Class {
	public static void main(String[] args) {
		int[] array = {6,9,8};
		List<Integer> list = new ArrayList<>();
		list.add(array[0]);
		list.add(array[2]);
		list.set(1, array[1]);
		list.remove(0);
		System.out.println(list);
	}
	
}

/*
 * What is the result of the following code?
 * 	A. [8]
	B. [9] (Correct)
	C. Something like [Ljava.lang.String;@160bc7c0
	D. An exception is thrown.
	E. The code does not compile.
 * */
