/**
* The main class of a SIR Simulation with discrete aspects to it.
* This class will run the simulation and be the "time keeper" for the
* application.
*/

public class Simulation  {


	public static void main(String[] args)
	{
		// Use a scanner to get the information necessary to start the sim
		// We will need:
		//    * Population size
		//    * number of acquaintances
		//    * spread rate for virus
		//    * duration of infection time
		//    * mortality rate for virus
		Scanner kb = new Scanner(System.in);

    // unbroke things
		int populationSize;
		do {
			System.out.print("Please enter a population size: ");
			populationSize = kb.nextInt();
			if(populationSize >= 0) break;
			System.out.println("Not a valid number!");
		} while(PopulationSize < 0);

		int baseInfected;
		do {
			System.out.print("Please enter population with the virus: ");
			baseInfected = kb.nextInt();
			if(baseInfected < populationSize)	break;
			System.out.println("Not a valid number!");
		} while(baseInfected > populationSize);

		double spreadrate;
		do {
			System.out.print("Please enter the spread rate of the virus: ");
			spreadrate = kb.nextDouble();
			if (spreadrate >= 0) break;
			System.out.println("Not a valid number!");
		} while(spreadrate < 0);

		// this method will instantiate the Population and Virus classes
		Population pop = new Population();
		Virus virus = new Virus();
		// Will have a loop that runs the simulation

		// Will report out results

		// Consider having the ability to write the results of the simulation
		// to a file so that we can see the results in a spreadsheet.

		// Testing commits
	}
}
