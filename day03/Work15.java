public class Work15{
	public static void main(String args[]){
		String str="Hello java!";
		Work15 o1=new Work15();
		if(str instanceof String)//����
		//if�����{}�ǿ���ʡ�Ե�
			System.out.println("str��String��Ķ���");
		else
			System.out.println("str����String��Ķ���");
		
		if(o1 instanceof Work15)
			System.out.println("o1��Work15�Ķ���");
	}
}