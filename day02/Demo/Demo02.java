public class Demo02{
	public static void main(String args[]){
		int a = 1;
		int b = 2;
		int c = 3;
		/*
		(a>b) ? a : b;
		(a>c) ? a : c;
		(b>c) ? b : c;
		*/
		
		a>b?(a>c?a:c):(b>c?b:c);
		
		System.out.println("最大的数是：");
	}
}