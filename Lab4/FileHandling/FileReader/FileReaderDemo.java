import java.io.*;
class FileReaderDemo
{
	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("../FileWriter/F1.txt");
		int i;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
		}
		fr.close();
	}
}