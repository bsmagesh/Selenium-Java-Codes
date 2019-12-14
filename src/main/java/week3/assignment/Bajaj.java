package week3.assignment;

public class Bajaj extends Bike{
public void speed() {
	System.out.println("Speed - Fast");
}
public static void main(String args[])
{
	Bajaj test1=new Bajaj();
	test1.speed();
	test1.cost();
}
}
