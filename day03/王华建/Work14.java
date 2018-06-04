public class Work14{
	public static void main(String args[]){
		int number = 1;
		System.out.println("2的0次方："+number);
		
		number=number<<1;
		System.out.println("2的1次方："+number);
		
		number=number<<1;
		System.out.println("2的2次方："+number);
		
		number=number<<1;//每次在结果之上挪动
		System.out.println("2的3次方："+number);
	}
}