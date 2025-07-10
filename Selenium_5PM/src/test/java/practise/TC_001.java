package practise;

public class TC_001 extends BaseClass
{

	public static void main( String[]args) throws Exception
	{
	init();
	
	browserLaunch ("Chrome");
	navigateUrl("https://www.amazon.in");
			
			
			browserLaunch ("Firefox");
			navigateUrl("https://www.flipkart.com");
}
}
