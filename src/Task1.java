import java.util.Scanner;


public class Task1 {

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
		
		if (n<0) {n=0;}
		int Numbers[] = new int[n];
		
		for (int i = 1; i < n; i++) {
			Numbers[i] = i;
		}
		for (int i =2 ; i*i < n; i++) {
			if (Numbers[i] != 0) {
				for(int j = i*2; j < n; j+=i){
					Numbers[j] = 0;							
				}
			}
		}
		for (int i = 1; i < n; i++) {
			if (Numbers[i] != 0) {
				System.out.print(Numbers[i] + " ");
			}
		}	
	}
}


