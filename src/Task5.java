import java.util.Scanner;


public class Task5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in); 
		String Slovo = new String();
		boolean Pol = true;
		
		System.out.print("Введите одно слово");
		if(sc.hasNext()) { 
          Slovo = sc.next();
		} 
		else {
			System.out.println("Вы не ввели слово");
   		}
		
	
		for (int i=0; i<=Slovo.length()/2; i++ ) {
			if  (Slovo.charAt(i) != Slovo.charAt(Slovo.length()-i-1)) { 
				Pol = false;
			}
		}
		
		if (Pol) {
			System.out.println("Это полиндром");
		}
		else {
			System.out.println("Это не полиндром");
		}
	}

}
