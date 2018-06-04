public class Demo04{
	public static void main(String args[]){
		int i,a,b,c,d;
		for(i=1000;i<10000;i++){
			a = i%10;//gewei
			b = (i%100)/10;//baiwei
			//c = i/10;
			if(i == 1000*b+100*b+10*a+a && a != b){
				
				System.out.println("车牌号："+a+a+b+b);
			}
		}//会出现答案重复的问题
		
		/*
		int a,b,i,j;
		
		for(i=0;i<9;i++){
			
			for(j=0;j<9;j++){
				
				a = i;
				
			}
			b = j;
			
			if(a != b){
				
				System.out.println("车牌号："+a+a+b+b);
			}
		}
		*/

	}
		
	
}