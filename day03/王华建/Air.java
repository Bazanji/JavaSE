public class Air{
	public static void main(String args[]){
		int month = 5;
		int zl = 1;//1 = jj
		double count;
		if(month>=5&&month<=10){
			if(zl == 1){
				count = 0.8;
			}else{
				count = 0.9;
			}
		}else{
			if(zl == 1){
				count = 0.6;
			}else{
				count = 0.7;
			}
		}
		System.out.println(count);
	}
}