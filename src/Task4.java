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
		
		System.out.print("������� ������ ����� ����� ");
		if(sc.hasNextInt()) { 
          a = sc.nextInt();
		} 
		else {
			System.out.println("�� �� ����� ����� �����");
   		}
		
			
		System.out.print("������� ������ ����� ����� ");
		if(sc.hasNextInt()) { 
          b = sc.nextInt();
		} 
		else {
			System.out.println("�� �� ����� ����� �����");
   		}
		
		if ((a&b)!=0) {	
			if (a>b) {
				nd=NkNd.nod(Math.abs(a),Math.abs(b));
				System.out.println("��� ����� " + nd);
				nk=NkNd.nok(Math.abs(a),Math.abs(b));
				System.out.println("��� ����� " + nk);
			}
			else {
				nd=NkNd.nod(Math.abs(b),Math.abs(a));
				System.out.println("��� ����� " + nd);
				nk=NkNd.nok(Math.abs(b),Math.abs(a));
				System.out.println("��� ����� " + nk);
			}
		}
		else {
			System.out.println("������ ����� ��� 0 ");
		}
	}

}
