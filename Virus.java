
public class Virus {
	private double deathRate;
	private double spreadRate;
	private int infectiousDays;
	
	/**
	 * creates a new virus
	 *  parameters are as follows-
	 *   double rate of spreading
	 *   double rate of death
	 *   int number of days infected days of infection
	*/
	
	public Virus(double spread, double death, int days) {
		deathRate = death;
		spreadRate = spread;
		infectiousDays = days;
	}

/**
*this is a method to get the mortality rate for the virus
* @return double that represents the rate of death
**/ 
public double getDeathRate(){
	return deathRate;
	}
/**
*this is a method to get the spread rate for the virus
* @return double that represents the rate of spread
**/
public double getSpreadRate(){
	return spreadRate;
}
/**
*this is a method to get the duration of the virus in a person
* @returns integer that represents the number of days the person is infected
**/
public int getInfectiousDays(){
	return infectiousDays;
}


	public static void main(String[] args)
	{
		Virus ebola = new Virus(.20, .50, 10);
		System.out.println(ebola.getSpreadRate()==.2);
		System.out.println(ebola.getDeathRate()==.5);
		System.out.println(ebola.getInfectiousDays==10);
		System.out.println(ebola); // should return "Spread Rate: .2 Death Rate: .5 Infectious Days: 10"		
	}
}
