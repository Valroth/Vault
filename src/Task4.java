import java.util.Scanner;

class NODNOK {
	
	int nod(int A,int B){
		return B == 0 ? A : nod(B,A%B);		
	}
	
	int nok(int A,int B){
		return A / nod(A,B)*B;
	}
}

public class Task4 {
	
	public static void main(String[] args) {
		
		NODNOK NkNd = new NODNOK();
		Scanner sc = new Scanner(System.in); 
		int a=0,b=0,nd=0,nk=0;
		
		System.out.print("Введите первое целое число ");
		if(sc.hasNextInt()) { 
          a = sc.nextInt();
		} 
		else {
			System.out.println("Вы не ввели целое число");
   		}
		
			
		System.out.print("Введите второе целое число ");
		if(sc.hasNextInt()) { 
          b = sc.nextInt();
		} 
		else {
			System.out.println("Вы не ввели целое число");
   		}
		
		if ((a&b)!=0) {	
			if (a>b) {
				nd=NkNd.nod(Math.abs(a),Math.abs(b));
				System.out.println("НОД равно " + nd);
				nk=NkNd.nok(Math.abs(a),Math.abs(b));
				System.out.println("НОК равно " + nk);
			}
			else {
				nd=NkNd.nod(Math.abs(b),Math.abs(a));
				System.out.println("НОД равно " + nd);
				nk=NkNd.nok(Math.abs(b),Math.abs(a));
				System.out.println("НОК равно " + nk);
			}
		}
		else {
			System.out.println("Нельзя найти для 0 ");
		}
	}

}
