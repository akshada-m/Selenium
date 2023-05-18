package DemoS;

public class demo7_gettagname 
{
	public static void main(String[] args) 
	{
		String tag = getTagname("//a[@id='month']");
		System.out.println(tag);
	}
	
	public static String getTagname(String xpathexp)
	{
		int a=xpathexp.lastIndexOf('/');
		int b = xpathexp.indexOf('[');
		String tagname = xpathexp.substring(a+1, b);
		return tagname;
		
	}
}
