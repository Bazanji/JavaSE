import java.util.Scanner;
public class Work12{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("num:");
		int number=scanner.nextInt();
		System.out.println("is JS?"+((number&1) !=0 ? "yes":"no"));
		//"yes"±ØÐë¼ÓË«ÒýºÅ
		
	}
}