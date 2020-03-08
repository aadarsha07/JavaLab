import java.io.*;
class FileWriterDemo
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fw = new FileWriter("Hi.txt");
		fw.write("Hi Buddy! How Are You ?");
		fw.close();


	}
}
