
/**
 * A virus class to be part of an SIR simulation which creates discrete infections. 
 * @author Sonja Eliason, Caleb Hastings, Taylor Rossini 
 * @version 0.1
 * @date 10.23.14
*/

public class Virus {
	private double deathRate;
	private double spreadRate;
	private int infectiousDays;
	
	/**
	 * creates a new virus
	 *  parameters are as follows-
	 *  @param spread a double rate of spreading
	 *  @param death a double rate of death
	 *  @param days an int number of days infected days of infection
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
* @return integer that represents the number of days the person is infected
**/
public int getInfectiousDays(){
	return infectiousDays;
}

/**
 * returns parameters as a lovely string =)
 * @return string that displays the parameters of the virus in a neat and -ahem- well formatted slate...
 */

public String toString() {
	return "Spread Rate- "+ebola.getSpreadRate()+" Death rate- "+ebola.getDeathRate()+" Infectious Days- "+ebola.getInfectiousDays();
}

}

	public static void main(String[] args)
	{
		Virus ebola = new Virus(.20, .50, 10);
		System.out.println(ebola.getSpreadRate()==.2);
		System.out.println(ebola.getDeathRate()==.5);
		System.out.println(ebola.getInfectiousDays()==10);
		System.out.println("Spread Rate- "+ebola.getSpreadRate()+" Death rate- "+ebola.getDeathRate()+" Infectious Days- "+ebola.getInfectiousDays()); // should return "Spread Rate: .2 Death Rate: .5 Infectious Days: 10"		
	}
}
