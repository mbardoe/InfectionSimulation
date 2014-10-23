
public class Virus {
	double mortalityRate;
	double spreadRate;
	int lengthOfInfection;

/**
*this is a method to get the mortality rate for the virus
**/
public double getMortalityRate(){
	return mortalityRate;
	}
/**
*this is a method to get the spread rate for the virus
**/
public double getSpreadRate(){
	return spreadRate;
}
/**
*this is a method to get the duration of the virus in a person
*
**/
public int getLengthOfInfection(){
	return lengthOfInfection;
}


	public static void main(String[] args)
	{
		Virus ebola = new Virus(.20, .50, 10);
		System.out.println(ebola.getSpreadRate()==.2);
		System.out.println(ebola.getMortalityRate()==.5);
		System.out.println(ebola.getLengthOfInfection()==10);
		System.out.println(ebola); // should return "Spread Rate: .2 Death Rate: .5 Infectious Days: 10"		
	}
}
