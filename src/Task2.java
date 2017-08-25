import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		int n=0;
		
		System.out.print("Введите натуральное число N: ");
		if (sc.hasNextInt()) { 
          n = sc.nextInt();
		} 
		else {
			System.out.println("Вы не ввели натуральное число");
   		}
		
		if(n>2) {
		int n1 = 1, n2 = 2, nn = 2;
		System.out.print(n1 + " 1 ");
		do {
			System.out.print(nn + " ");
			nn = n1 + n2;
			n1 = n2;
			n2 = nn;}
		while (nn < n);
		}
	}

}
