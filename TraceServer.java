import java.io.*;
import java.net.*;
class TraceServer
{
	public static void main(String args[])
	{
		try
		{
			String str;
			System.out.print("Enter IP address:");
			BufferedReader buf1=new BufferedReader(new InputStreamReader(System.in));
			String ip=buf1.readLine();
			Runtime rt=Runtime.getRuntime();
			Process p=rt.exec("ping"+ ip);
			InputStream in=p.getInputStream();
			BufferedReader buf2=new BufferedReader(new InputStreamReader(in));
			while((str=buf2.readLine())!=null)
			{
				System.out.println(" "+str);
			}
		}
		catch(Exception e)
		{
				System.out.println(e.getMessage());
		}
	}
}