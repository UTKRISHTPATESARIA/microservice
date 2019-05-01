import java.io.*;

public class Filter implements FilenameFilter {
	
	String ext;
	public Filter(String ext)
	{
		this.ext="."+ext;
	}

	public boolean accept(File d,String name)
	{
		return name.endsWith(ext);
	}
	
	
}
