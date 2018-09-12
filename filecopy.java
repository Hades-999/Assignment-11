import java.io.*;
import java.util.*;
class filecopy
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream in=null;
		FileOutputStream out=null;
		File f=new File("acadview.txt");
		Scanner input = new Scanner(f);
		try
		{
			in=new FileInputStream("chitkara.txt");
			out=new FileOutputStream("acadview.txt");
			int c;
			while((c=in.read())!=-1)
				out.write(c);
		}
		finally
		{
			if(in!=null)
				in.close();
			if(out!=null)
				out.close();
		}
		System.out.println("Contents in Copied file:");
		while (input.hasNextLine())
		{
			System.out.println(input.nextLine());
		}
	}
}
		