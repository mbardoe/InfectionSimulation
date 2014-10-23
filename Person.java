/**
* This class is part of a simulation of the spread of a virus 
* through a population. It uses the SIR model to
* model the spread of virus through a population.
* @author Matthew Bardoe, and others
* @version 0.1
* 
*/

public class Person  {
	private bool isInfected;
	private bool isAlive;
	private bool isRecovered;
	private Virus [] virus; 

	/**
	* A setter method for the infection status of a person.
	* @param infected a boolean describing whether a person is infected.
	*/
	public void setInfected(bool infected)
	{
		this.isInfected=infected;
	}
	/**
	* A setter method for the recovered status of a person.
	* @param infected a boolean describing whether a person is recovered.
	*/
    public void setRecovered (bool recovered)
	{
		this.isRecovered=recovered;
	}
	/**
	* A setter method for the life statuse of a person.
	* @param alive a boolean describing whether a person is alive.
	*/
	public void setAlive(bool alive)
	{
		this.isAlive=alive;
	}

	/**
	* A getter method for the infection status of person.
	* @return boolean indicating the infection state of the person.
	*/
	public bool infected()
	{
		return isInfected;
	}
    public bool recovered()
    {
    	return isRecovered;
    }


	/**
	* This main method is meant to test some of the basic implementations
	* of this class.
	*/
	public static void main(String[] args){
		Person person = new Person();
		System.out.println(person.susceptible());
		Person friend = new Person();
		person.addContact(friend);
		System.out.println(person.getNumContacts());
		System.out.println(person.getContacts());
		System.out.println(friend.getContacts());
		

	}
	
}

