
public class Virus {
	

	public static void main(String[] args)
	{
		Virus ebola = new Virus(.20, .50, 10);
		System.out.println(ebola.getSpreadRate()==.2);
		System.out.println(ebola.getDeathRate()==.5);
		System.out.println(ebola.getInfectiousDays()==10);
		System.out.println(ebola); // should return "Spread Rate: .2 Death Rate: .5 Infectious Days: 10"		
	}
}