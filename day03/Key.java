import java.util.*;
import java.io.*;

public class Key{
	public static void main(String args[]) throws Exception{
		
		byte key = 56;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入要加密的文件名：");
		String org = sc.next();
		
		System.out.println("请输入加密后的文件名：");
		String newFile = sc.next();
		
		FileInputStream fi = new FileInputStream(org);
		FileOutputStream fo = new FileOutputStream(newFile);
		
		byte [] buffer = new byte [2048];
		
		int length = -1;
		while((length = fi.read(buffer))>0){
		for(int i=1;i<length;i++){
			
			buffer [i] = (byte) (buffer[i]^key);
		}fo.write(buffer,0,length);
	}
	fi.close();
	fo.close();
	
	System.out.println("OK!");
	
	}
}
	