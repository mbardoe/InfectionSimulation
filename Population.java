/**
* A population class to be part of an SIR simulation with a discrete number
* of acquaintances of each member of the population.
* @author Matthew Bardoe, etc.
* @version 0.1
* @date 10/21/14
*/

class Population  {
	private int populationSize;
	private Person[] people;

	/**
	* This method adds a person to the population
	*/
	public void addPerson();

	/**
	* This method creates the acquaintances for all the
	* people in the population.
	*/
	private void createAquaintances();

	/**
	* This function returns the number of people that are 
	* infected in the population.
	* @return int the number of infected people in the population.
	*/
	public int numberInfected();

	/**
	* A main method to test some of the functionality of the 
	* Population class.
	*/
	public static void main(String[] args)
	{
		// Create a population of size 1000 where everyone knows
		// 5 other people.
		Population population = new Population(1000,5);
		Person larry = population.getPerson(300);
		System.out.println(larry);
		System.out.println(population.numberInfected);
		System.out.println(population.numberAlive);
		System.out.println(population.numberRecovered);
	}
}