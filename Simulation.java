/**
* The main class of a SIR Simulation with discrete aspects to it.
* This class will run the simulation and be the "time keeper" for the
* application.
* @author Patrick K.
* @author Alex Z.
* @author Ben O.
*/

import java.nio.file;

public class Simulation  {
	private Population pop;
	private Virus virus;

	public void configure() {
		// configure pop and virus here
		Scanner kb = new Scanner(System.in);

			// unbroke things
		int populationSize;
		do {
			System.out.print("Please enter a population size: ");
			populationSize = kb.nextInt();
			if(populationSize >= 0) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(PopulationSize < 0);

		int baseInfected;
		do {
			System.out.print("Please enter population with the virus: ");
			baseInfected = kb.nextInt();
			if(baseInfected < populationSize)	break;
			System.out.println("Input doesn't make sense in this context!");
		} while(baseInfected > populationSize);

		double spreadrate;
		do {
			System.out.print("Please enter the spread rate of the virus: ");
			spreadrate = kb.nextDouble();
			if (spreadrate >= 0) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(spreadrate < 0);
	}

	public void tick() {
		// single tick of the simulation
	}

	public String generateReport() {
		// return a string of the current population's state
	}

	public void writeToFile(String str, String filename) {
		// write out
		Charset charset = Charset.forName("US-ASCII");
		String output = "test output\n"; // NYI
		try (BufferedWriter writer = Files.newBufferedWriter("postmortem.txt", charset)) {
			writer.write(output, 0, output.length());
		} catch (IOException x) {
			System.out.println("Encountered an error writing output.")
			System.err.format("IOException: %s%n", x);
		}
	}

	public static void main(String[] args)
	{
		// Use a scanner to get the information necessary to start the sim
		// We will need:
		//    * Population size
		//    * number of acquaintances
		//    * spread rate for virus
		//    * duration of infection time
		//    * mortality rate for virus


		// this method will instantiate the Population and Virus classes
		Population pop = new Population();
		Virus virus = new Virus();

		// Will have a loop that runs the simulation

		// Loop to infect the first patients.

		// final loop that goes until the infection has run its course.
		while((pop.numberInfected() != 0 ) && (pop.numberAlive() >= 0 )) {
					
		}

		// Will report out results

		// Consider having the ability to write the results of the simulation
		// to a file so that we can see the results in a spreadsheet.


	}
}
