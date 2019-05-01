import java.io.*;

public class InpOut {
	public static void main(String args[])
	{
			String dir="/java";
			File f1=new File(dir);
			
			FilenameFilter ob=new Filter("html");
			String s[]=f1.list(ob);
			
	}

}
