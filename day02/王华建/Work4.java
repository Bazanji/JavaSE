public class Work4{
	public static void main(String args[]){
		double java = 90;
		double sql = 85;
		double math = 95;
		
		double sum = java - sql;
		
		double avg = (java + sql + math)/3;
		
		System.out.println("java与sql课程分数之差："+sum);
		System.out.println("3门课的平均分："+avg);
	}
}