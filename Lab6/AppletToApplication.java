public class AppletToApplication 
{
	int a;
	AppletToApplication()
	{
		a =15;
	}
	public void paint()
	{
		System.out.println("Age =" +a);
	}
    
    public static void main(String[] args) 
    {
    	AppletToApplication obj = new AppletToApplication();
    	obj.print();
    }
}