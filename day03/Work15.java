public class Work15{
	public static void main(String args[]){
		String str="Hello java!";
		Work15 o1=new Work15();
		if(str instanceof String)//归类
		//if后面的{}是可以省略的
			System.out.println("str是String类的对象");
		else
			System.out.println("str不是String类的对象");
		
		if(o1 instanceof Work15)
			System.out.println("o1是Work15的对象");
	}
}