public class Work10{
	public static void main(String args[]){
		short s = 15;
		//short s = s - 1; 
		//重复声明，损失精度
		
		s = (short)(s - 1);//true
		
		
		//s = (short)s - 1;
		//损失精度
		
		byte b = 123;
		
		//byte d = b + 1;
		b += 1;
		
		byte e = 12;
		//e = e + 1;
	}
}