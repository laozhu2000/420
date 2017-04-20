package j419;
import java.util.Scanner;
public class age {
	public static void main (String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄêÁä:");
		int age=scanner.nextInt();
		scanner.close();
	System.out.println(age>=18&&age<=50);
	}
}
