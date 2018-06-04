public class Work1{
	public static void main(String args[]){
		int i1 = 123;//定义整型变量
		//byte b;
		//b = (byte)i1;
		short s = 30000;
		int i = 100;
		long l1 = 1001;
		int i8 = 012;
		int i16 = 0x12;
		float b1 = 12.3f;//F
		double b4 = 12.3;
		float b2 = 2.66e13f;//科学计数法
		double b3 = 1.57e-3;
		
		System.out.println(2.76);
		System.out.println(13+2.76);//15.76
		System.out.println(12+2.76);//14.76
		boolean isChecked = true;//不能用0,1
		
		char a ='A';
			System.out.print('a');
			System.out.print('\n');
			System.out.print('b');
			System.out.print('c');
			System.out.print('\t');
			System.out.println('d');
			System.out.println("\"\\");//为啥只显示一个\？
									//因为双引号内的才显示
			
			System.out.println("******");
			
			//自动类型提升
			byte b10 = 10;
			byte c10 = 20;
			byte d10 = b10;
			byte d = (byte)(b10 + c10);//int
			System.out.println(d);
			
			char c = 'A';
			char b = 'b';
			int f1 = c + b;
			System.out.println(f1);
		
	}
}