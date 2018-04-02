package readWriteFile;
//import java.io.*;
//import java.lang.*;
import java.util.*;

public class CreateFile {
	
	private Formatter x;
	
	public void openFile() 
	{
		try 
		{
			x = new Formatter("testing.txt");
		} 
		catch (Exception e)
		{
			System.err.println("ERROR: unable to create");
		}
	}
	public void addRecords(String id, String fn, String ln) 
	{
		x.format("%s%s%s", id,fn,ln);
	}
	
	public void closeFile() 
	{
		x.close();
	}
}
