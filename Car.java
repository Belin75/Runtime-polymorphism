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
Vehicle v=new Vehicle();
Car c=new Car();
Vehicle ref;
ref=v;
ref.run();
ref=c;
ref.run();
}
}

