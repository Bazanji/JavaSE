public class Demo07{
	public static void main(String args[]){
		int i = 10,j = 3;
		int sum = 0;
		
		System.out.println(10%3);
		System.out.println(10%-3);
		System.out.println(-10%3);
		System.out.println(-10%-3);//ȡ��ֻ�ͱ������й�
		
		System.out.println(i%j);
		System.out.println("**************");
		
		sum = i++;//��=��+
		
		System.out.println("i:"+i+"\t sum:"+sum);
		
		sum = ++i;//��+��=
		
		System.out.println("i:"+i+"\t sum:"+sum);
		
	}
}