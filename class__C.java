public class class__C {
	private static int $;
	public static void main(String[] args) {
		String a_b;
		System.out.println($);
		System.out.println(a_b);
	}	
}


/*
 * What is the result of the following class ?
 * EL error esta en la linea 6 por que la variable a_b
 * no estas inicializada solo esta declarada.
 * 
 *A. Compiler error on line 1.
 *B. Compiler error on line 2.
 *C. Compiler error on line 4.
 *D. Compiler error on line 5.
 *E. Compiler error on line 6. (Correct)
 *F. 0null
 *G. nullnull
 * 
 * E. La opción E es correcta porque las variables locales requieren 
 * asignación antes de hacer referencia a ellas. La opción D es incorrecta 
 * porque las variables de clase e instancia tienen valores predeterminados y permiten hacer referencia.
 * a_b toma de forma predeterminada un valor nulo. 
 * Las opciones A, B y C son incorrectas porque los identificadores pueden comenzar con una letra,
 * un guión bajo o un signo de dólar. Las opciones F y G son incorrectas porque el código no se compila. 
 * Si a_b fuera una variable de instancia, el código se compilaría y generaría 0null. Para más información
 * 
 */