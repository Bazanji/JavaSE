/**
ԭ��"==" ��������������˵�Ƚϵ��Ƕ�������ã�equals�Ƚϵ������ݡ�����Java������Ĺ淶���ض���primitiveһ���ñ�auto-box����ͬ�Ĳ��ɱ��wrapper class������Щ����ᱻ���ٻ����Ա��ظ�ʹ�á���Щ�ض���ֵ������booleanֵ��false��true�����е�byteֵ������-128��127֮���short��intֵ���Լ�����0��0x7f֮�������charֵ��
Ҳ����˵���� a��bָ��ͬһ��������ΪֵС��127������a==bΪtrue��c��d��ʾ��ֵ������127����˻�ֱ𴴽�һ���µĶ�������c==dΪfalse�����ڱ���e��f�����ܶ��ߵ�����С��127����������������������ʹ��new���������ģ����������Զ�װ��boxing�Ļ���������e==fΪfalse������һ����װ������������ͱȽ�ʱ����װ���ͻ��Զ�����ɻ������ͣ���� e==m��a==m��Ϊtrue��
*/

//�����ļ��б���ַ����룬�����б�����Ҫ��������

public class Work9{
   public static void main(String args[]){
	 System.out.println((true==false));//boolean?
	 System.out.println((5.0==5));
	 System.out.println(""+(97=='a'));
	 System.out.println(""+(Float.NaN!=Float.NaN));
	 
	 Work9 o1 = new Work9();
	 Work9 o2 = new Work9();
	 Work9 o3 = o2;
	 
	 System.out.println("o1==o2:"+(o1==o2));
	 System.out.println("o2==o3:"+(o2==o3));
	 System.out.println("autoboxing---");
	 //autoboxing
	 Integer i =8;
	 //unboxing
	 System.out.println("i>8:"+(i>8));
	 //false
	 
	 Integer in1=new Integer(8);
	 Integer in2=new Integer(8);
	 
	 int in3=new Integer(8);
	 //unboxing
	 int in4=new Integer(8);
	 //unboxing
	 int in5=new Integer(200);
	 int in6=new Integer(200);
	 Integer in7=8;//auto
	 Integer in8=8;//auto
	 Integer in9=200;//auto
	 Integer in10=200;//auto
	 //autoboxing
	 
	 //???
	 System.out.println(in1==in2);//F
	 System.out.println(in1==in3);//T
	 System.out.println(in3==in4);//T
	 System.out.println(in5==in6);//T
	 System.out.println(in7==in8);//T
	 System.out.println(in9==in10);//F
	 
	 
	 
   }
}