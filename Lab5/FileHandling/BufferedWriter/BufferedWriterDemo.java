import java.io.*;
class BufferedWriterDemo
{
	public static void main(String[] args) throws Exception
	{
		FileWriter fw= new FileWriter("F1.txt");
		fw.write("Hey yah I'm fine bro...");
		BufferedWriter bf = new BufferedWriter(fw);
		bf.newLine();
		bf.write("Okay nice!");
		bf.flush();
		bf.close();
		fw.close();

	}
}