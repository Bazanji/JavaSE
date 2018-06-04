public class Taxi{
	public static void main(String args[]){
		
		double cost;
		double time = 7;
		double dist = 2;

		if(time>=6&&time<=21){
			if(dist<=2){
				cost = 6 + 1;
System.out.println(cost);				
			}else{
				cost = 6+(dist - 2)*1.5 + 1;
				System.out.println(cost);
			}	
		}if(time>=22&&time<=5){
			if(dist<=2){
				cost = 7 + 1;
				System.out.println(cost);
			}else{
				cost = 7 + (dist - 2)*1.5 + 1;
				System.out.println(cost);
			}
		}		
	}
}