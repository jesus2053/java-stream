package mx.java.curso.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;


/**
 * Predicate
 * @author JNicolas
 *
 */

public class Ejemplo03_Predicate {
	
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> t1 =  num -> num > 10;
		
		System.out.println("t1 : "+t1.test(7));
		
		Predicate<String> t2 =  role -> role.equals("ROLE_ADMIN");
		System.out.println("t2 : "+t2.test("ROLE_ADMIN"));
		
		//BiPredicate<String, String> t3 = (a,b) -> a.equals(b);
		BiPredicate<String, String> t3 = String::equals;
		System.out.println(t3.test("jesus", "jesus"));
		
		BiPredicate<Integer, Integer> t4 = (i,j) -> j>i;
		System.out.println(t4.test(5, 6));
		
		
		
	}

}
