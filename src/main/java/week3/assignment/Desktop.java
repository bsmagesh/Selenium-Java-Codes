package week3.assignment;

public class Desktop implements HardWare,SoftWare {
public void hardwareResources()
{
	System.out.println("Hardware class");
}
public void softwareResources()
{
	System.out.println("Software class");
}
public void desktopModel()
{
	System.out.println("Desktop model");
}
public static void main(String args[])
{
	Desktop execute=new Desktop();
	execute.desktopModel();
	execute.hardwareResources();
	execute.softwareResources();
}
}
