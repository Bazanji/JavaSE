public class Work13{
	public static void main(String args[]){
		
		int i = 4;
		int week = (i+10)%7;
		if(week == 0){
			System.out.println("是星期天。");
		}
		else{
			System.out.println("是星期："+week);
		}
		
		
	}
}