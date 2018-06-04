public class Work2{
	public static void main(String args[]){
		//下面两种方式有区别吗？
		float f = (float)12.345;
		float g = 12.345f;
		System.out.println(f);
		System.out.println(g);
		//没有区别。
		
		
		//下面程序有问题吗？
		
		byte b1 =3;//无
		byte b2 =4;//无
		byte b3 =b1+b2;//有问题，损失精度
		byte b4 =3+4;//无
		
		
		
		//下面操作结果是什么？
		byte b =(byte)130;
		System.out.println(b);
		//-126
		
		//下面代码执行结果
		System.out.println("hello"+'a'+1);//helloa1
		System.out.println("a"+1+"hello");//a1hello
		System.out.println("5+5="+5+5);//5+5=55
		System.out.println(5+5+"=5+5");//10=5+5
	}
}
