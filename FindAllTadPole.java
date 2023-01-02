import java.util.ArrayList;
import java.util.List;

interface CanSwim {
}

class Amphibian implements CanSwim {
}

class Tadpole extends Amphibian {
}

public class FindAllTadPole {
	public static void main(String[] args) {
		List<Tadpole> tadpoles = new ArrayList<Tadpole>();
		for (Amphibian amphibian : tadpoles) {
			___________ tadpole = amphibian;
		}
	}
}

/*
 * 	Which of the following statements can be inserted in the blank line so that the code will
	compile successfully? (Choose all that apply)
	
 * 	A. CanSwim (Correct)
	B. Long
	C. Amphibian (Correct)
	D. Tadpole
	E. Object (Correct)
 */