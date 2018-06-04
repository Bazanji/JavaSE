/**
原因："==" 对于两个对象来说比较的是对象的引用，equals比较的是内容。按照Java虚拟机的规范：特定的primitive一定得被auto-box成相同的不可变的wrapper class对象，这些对象会被高速缓存以便重复使用。这些特定的值包括：boolean值的false与true，所有的byte值，介于-128到127之间的short和int值，以及介于0到0x7f之间的所有char值。
也就是说变量 a和b指向同一个对象，因为值小于127，所以a==b为true；c和d表示的值超过了127，因此会分别创建一个新的对象，所以c==d为false；对于变量e和f，尽管二者的内容小于127，但是由于这两个对象都是使用new产生出来的，不适用于自动装箱boxing的缓存规则，因此e==f为false。而当一个封装类型与基本类型比较时，封装类型会自动拆箱成基本类型，因此 e==m和a==m均为true。
*/

//若在文件中变更字符编码，则所有编码需要重新输入

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