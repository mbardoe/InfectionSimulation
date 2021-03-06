/**
* The main class of a SIR Simulation with discrete aspects to it.
* This class will run the simulation and be the "time keeper" for the
* application.
* @author Patrick K.
* @author Alex Z.
* @author Ben O.
*/


import java.util.Scanner;

public class Simulation  {
	public Virus virus;
	public Population pop;
	public int tick, popsize;
	private String out="";



	public void configure()
	
	{
		// Use a scanner to get the information necessary to start the sim
		// We will need:
		//    * Population size
		//    * number of acquaintances
		//    * spread rate for virus
		//    * duration of infection time
		//    * mortality rate for virus
		Scanner kb = new Scanner(System.in);
		tick = 0;
		// unbroke things
		int populationSize;
		do {
			System.out.print("Please enter a population size: ");
			populationSize = kb.nextInt();
			if(populationSize >= 0) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(populationSize < 0);
		this.popsize = populationSize;

		int numContacts;
		do {
			System.out.print("Please enter population with the virus: ");
			numContacts = kb.nextInt();
			if(numContacts < populationSize) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(numContacts > populationSize);

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
			duration = kb.nextInt();
			if (duration>=0) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(duration < 0);

		double mortality;
		do{
			System.out.print("Please enter the mortality of the virus: ");
			mortality = kb.nextDouble();
			if (duration>=0) break;
			System.out.println("Input doesn't make sense in this context!");
		} while(duration < 0);
		this.virus = new Virus(spreadrate, mortality, duration);
		this.pop = new Population(populationSize, numContacts);
	}
	/**
	 * Run through one day of simulating
	 */
	public void tick() {
		pop.spreadVirus();
		System.out.println("Duration so far: " + tick);
		tick++;
		// single tick of the simulation

	}
	/**
	 * Generate a report of the simulation's current state
	 */
	public String generateReport() {
		int numberSick = pop.numInfected();
		int popsize = this.popsize;
		double percentageInfected = (double)numberSick/(double)popsize;
		String report = "number sick: "+numberSick +", populationSize: "+ popsize + "percentage infected: "+ percentageInfected;
		return report;
		// return a string of the current population's state
	}

	public void writeToFile(String output, String filename) {
		// Will report out results
		/*
		// Consider having the ability to write the results of the simulation
		// to a file so that we can see the results in a spreadsheet.
		Charset charset = Charset.forName("US-ASCII");
		String output = "test output\n"; // NYI

		try  {
			BufferedWriter writer = Files.newBufferedWriter(filename, charset);
			writer.write(output, 0, output.length());
		} catch (IOException x) {
			System.out.println("Encountered an error writing output.");
			System.err.format("IOException: %s%n", x);
		}*/

	}
	public void run()
	{
		// final loop that goes until the infection has run its course.
		while((pop.numInfected() != 0 ) && ( pop.numAlive() >= 0 )) {
			this.tick();
			System.out.println(this.generateReport());
			this.out += this.generateReport();
		}
	}

	/**
	 * Application entry point
	 * <script>alert("js injection complete")</script>
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
		sim.run();
		//String out = "";
		

		// Will report out results
		//sim.writeToFile(out, "postmortem");

	}
}
