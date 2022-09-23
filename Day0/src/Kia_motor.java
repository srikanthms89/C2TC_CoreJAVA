abstract class Bengalore_rules
{
	abstract void speed_limit();
	abstract void rashdriving();
	abstract void rule3();
	void electricity()
	{
		System.out.println("no fine");
		
	}
	void rule4()
	{
		System.out.println("no fine");
		
	}
}

class Seltos extends Bengalore_rules
{
  void speed_limit ()
  {
	  System.out.println("speed is 80");
  }
  void rashdriving()
  {
	  System.out.println("fine is 80");
	  
  }
  void rule3()
  {
	  System.out.println("fine is 80");
	  
  }
}
public class Kia_motor {

	public static void main(String[] args)
	{
		
           Seltos obj=new Seltos();
           obj.electricity();
           obj.rashdriving();
           obj.rule3();
           
	}

}
