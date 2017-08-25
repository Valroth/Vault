import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		double[] Kord = new double[9];
		String[] Ind = {" ","ax","ay","bx","by","cx","cy","dx","dy"};
		
		for (int i=1; i<=8; i++) {
			System.out.println("Введите " + Ind[i] + " координату");
			if(sc.hasNextDouble()) { 
				Kord[i] = sc.nextDouble();
			} 
			else {
				System.out.println("Вы ввели неверную координату");
				break;
			}	
		}
		
		double K = 0;
		
		if (Kord[1]>Kord[3]) {
			K = Kord[1];
			Kord[1] = Kord[3];
			Kord[3] = K;
			K = Kord[2];
			Kord[2] = Kord[4];
			Kord[4] = K;
		}
		
		if (Kord[5]>Kord[7]) {
			K = Kord[5];
			Kord[5] = Kord[7];
			Kord[7] = K;
			K = Kord[6];
			Kord[6] = Kord[8];
			Kord[8] = K;
		}
	
		double k1,k2,c1,c2,x0,y0;
		
		k1 = (Kord[4]-Kord[2])/(Kord[3]-Kord[1]);
		k2 = (Kord[8]-Kord[6])/(Kord[7]-Kord[5]);
		
		if (k1!=k2) {
			c1 = Kord[2]-k1*Kord[1];
			c2 = Kord[6]-k2*Kord[5];
			x0 = (c2-c1)/(k1-k2);
			y0 = k1*x0+c1; 
			if ((x0>Kord[1])&(x0<Kord[3])&(x0>Kord[5])&(x0<Kord[7])) {
				System.out.println("Отрезки пересикаются");
			}
			else {
				System.out.println("Отрезки не пересикаются");
			}
		}
		else {
			System.out.println("Отрезки паралейны или лежат на одной прямой");
		}
	
	
	}

}
