import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		String Text = new String();
		String nText = new String();
				
		System.out.println("Введите исходный текст");
		if(sc.hasNextLine()) { 
          Text = sc.nextLine();
		} 
	
		for (int i=0; i<Text.length(); i++) {
			if (!Character.isDigit(Text.charAt(i))) {
				nText = nText + Text.charAt(i);
			}
		}
		
		System.out.println("После удаления цифр получиться");
		System.out.println(nText);
	}

}
