class Vehicle
{
void run()
{
System.out.println("for driving");
}
}
class Car extends Vehicle
{
void run()
{
System.out.println("Drive safely");
}
public static void main(String args[])
{
Vehicle c=new Car();
c.run();
}
}

