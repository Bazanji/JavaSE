public class Work4{
   public static void main(String args[]){
	   double a=5.2;
	   double b=3.1;
	   double mod=a%b;
	   System.out.println(mod);
	   System.out.println("5对0.0求余的结果："+5%0.0);
	   System.out.println("-5.0对0.0求余的结果："+-5.0%0);
	   System.out.println("0对5.0求余的结果："+0%5.0);
	   System.out.println("0对0.0求余的结果："+0%0.0);
   }//0不能作除数，NaN是无数值的意思
}