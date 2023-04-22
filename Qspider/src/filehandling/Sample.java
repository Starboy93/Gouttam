package filehandling;
import java.io.File;
import java.io.IOException;

public class Sample 
{
 public static void main(String[] args)throws IOException
 {
	File f1= new File("c:/new folder/FolderHandling/aka.txt");
	if (f1.createNewFile()) 
	{
		System.out.println("File is created");
	}
	else 
	{
		System.out.println("File is not created");
	}
 }
}
