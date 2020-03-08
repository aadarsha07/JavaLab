import java.io.*;
class MergeFileDemo
{
	public static void main(String[] args) throws Exception
	{
		FileReader f1= new FileReader("../FileWriter/F1.txt");
		FileReader f2 = new FileReader("../FileWriter/Hi.txt");
		int i;
		while((i=f1.read())!=-1){
			System.out.print((char)i);
		}
		while((i=f2.read())!=-1){
			System.out.print((char)i);
		}
		f1.close();
		f2.close();
		
	}
}