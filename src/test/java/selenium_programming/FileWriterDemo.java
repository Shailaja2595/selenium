package selenium_programming;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriterDemo
{

	public static void main(String[] args) throws IOException
	{
		// REpresenting file
		File file =new File("shail.txt");
		
		//creating file
		if(!file.exists())
		{
			file.createNewFile();
		}
		

		FileOutputStream fs = new FileOutputStream(file);
		String s="My name is shailaja . \nI am learning java language . \nSelenium .";
		fs.write(s.getBytes());
		fs.flush();
		
		System.out.println("End of the program");
		
		
	}

}
