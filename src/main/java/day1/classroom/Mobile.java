package day1.classroom;

public class Mobile {
public boolean makeCall(int number)
{
	System.out.println("dialled number" +number);
	return true;
}
public boolean sendSMS(String Name)
{
	System.out.println("Sent SMS" +Name);
	return true;
}
public boolean shutDown()
{
	System.out.println("Mobile shut down succesfull");
	return true;
}
public static void main(String[] args)
{
	Mobile phone = new Mobile();
	boolean makeCall = phone.makeCall(9);
	System.out.println(makeCall);
	phone.sendSMS("Test");
	phone.shutDown();
}
}
