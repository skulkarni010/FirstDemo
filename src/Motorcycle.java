class Motorcycle 
{
String make;
String color;
boolean engineState;

public static void main(String []args) 
{
System.out.println("Hello World"); 
System.out.println("Hello World2"); 
}	
void startEngine() {
if (engineState == true)
{
System.out.println("The engine is already on.");
}

else 
{
engineState = false;
System.out.println("The engine is now on.");
}

}
}