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
	private int numberSick;
	private int popsize;
	private double percentageInfected;
	private String report;

	/**
	 * Configure the simulation
	 */
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
			if(baseInfected < populationSize) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(baseInfected > populationSize);

		double spreadrate;
		do {
			System.out.print("Please enter the spread rate of the virus: ");
			spreadrate = kb.nextDouble();
			if (spreadrate >= 0) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(spreadrate < 0);

		int duration;
		do{
			System.out.print("Please enter the duration of the virus: ");
			duration = kb.nextInt;
			if (duration>=0) break;
			System.out.println("Input doesn't make sense in this context!")
		} while(duration < 0);
	}
	/**
	 * Run through one day of simulating
	 */
	public void tick() {
		// single tick of the simulation
	}
	/**
	 * Generate a report of the simulation's current state
	 */
	public String generateReport() {
		numberSick = pop.getNumberInfected();
		popsize = pop.getPopulationSize();
		percentageInfected = (double)numberSick/(double)popsize;
		report = "number sick: "+numberSick +", populationSize: "+ popsize + "percentage infected: "+ percentageInfected;
		return report;
		// return a string of the current population's state
	}

	/**
	 * Write an arbitrary string to an arbitrary file
	 * @param str String to write
	 * @param filename File to write to
	 */
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

	/**
	 * Application entry point
	 */
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
		Simulation sim = new Simulation();

		sim.configure();
		String out = "";
		// final loop that goes until the infection has run its course.
		while((pop.numberInfected() != 0 ) && ( pop.numberAlive() >= 0 )) {
			sim.tick();
			System.out.println(sim.generateReport());
			out += sim.generateReport();
		}

		// Will report out results
		sim.writeToFile(out, "output.txt");


	}
}
