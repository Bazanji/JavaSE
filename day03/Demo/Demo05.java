public class Demo05{
	public static void main(String arg[]){
		
		int a;
		int b;
		int c;
		//int i = 100;
		//δ֪��һ��Ҫ��ʼ������
	for(a=1;a<20;a++){
		for(b=1;b<33;b++){
		c=100-a-b;
		if(5*a+3*b+c/3 == 100  ){//����δ֪�����и�ֵ�仯���������޷�������
			if(a+b+c == 100){
				System.out.println(a+","+b+","+c);
			}
		}
		}
	}		
	}
}