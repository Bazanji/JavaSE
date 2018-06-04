public class Work10{
	public static void main(String args[]){
		int number = 75;
		System.out.println((number >70&&number<75));
		//false
		
		System.out.println((number >80||number<75));
		//false
		
		System.out.println(!(number>80||number<75));
		//true
	}
}