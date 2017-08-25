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
			if (Text.charAt(i) != '0'&Text.charAt(i) != '1'&Text.charAt(i) != '2'&Text.charAt(i) != '3'&Text.charAt(i) != '4'
					&Text.charAt(i) != '5'&Text.charAt(i) != '6'&Text.charAt(i) != '7'&Text.charAt(i) != '8'&Text.charAt(i) != '9') {
				nText = nText + Text.charAt(i);
			}
		}
		
		System.out.println("После удаления цифр получиться");
		System.out.println(nText);
	}

}
