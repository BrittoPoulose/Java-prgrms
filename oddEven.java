import java.util.*;
import java.io.*;

public class oddEven
{
	public static void main(String[] args)throws IoException, FileNotFoundException
	{
		
		
		File f1=new File("oddEven.txt");
		File f2=new File("even.txt");
		File f3=new File("odd.txt");
		
	
		FileInputStream in=new FileInputStream(f1);
		FileOutputStream obj1= new FileOutputStream(f2);
		FileOutputStream obj2=new FileOutputStream(f3);
	
	
	
	     do{
		int i=in.read();
		if(i%2 == 0)
		{
			obj1.write(i);
		}
		else
		{
			obj2.write(i);
		}
		while(i != -1)
		{
			in.close();
			obj1.close();
			obj2.close();
		}
	}
	
	
	
	
}
