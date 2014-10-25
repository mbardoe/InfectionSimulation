/**
* This class is part of a simulation of the spread of a virus 
* through a population. It uses the SIR model to
* model the spread of virus through a population.
* @author Ginny Nie
* @version 0.1
* 
*/

public class Person  {
	private bool isInfected;
	private bool isAlive;
	private bool isRecovered;
	private Virus virus; 
	private int daysInfected;
	private Person[] contacts;

	public Person(int numContacts) {
		isInfected=false;
		isAlive=true;
		isRecovered=true;
		// instantiate contacts
		contacts= new Person[numContacts];
	}
	/**
	* A setter method for the contacts  of a person.
	* @param newContact a contact the person has.
	*/
	public void addContact(Person newContact){
		for (int i=0; i<contacts.length; i++)
		{
			if (contacts[i]==null)
			{
				contacts[i]=newContact;
			}
		}
	}
	/**
	* A setter method for the infection status of a person.
	* @param infected a boolean describing whether a person is infected.
	*/
	public void setInfected(bool infected)
	{
		this.isInfected=infected;
	}
	/**
	* A setter method for the alive status of a person.
	* @param alive a boolean describing whether a person is alive.
	*/
    public void setAlive(bool alive)
	{
		this.isAlive=alive;
	}
	/**
	* A setter method for the recovered status of a person.
	* @param recovered a boolean describing whether a person is recovered.
	*/
	public void setRecovered (bool recovered)

	{
		this.isRecovered=recovered;
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
    public bool alive()
    {
    	return isAlive;
    }
    public int getNumContacts(){
    	return numContacts;
    }

    public Person getContacts(){
    	return person;
    }
    public int getPopulationSize();
    public void spreadVirus()
    {
    	//Check if the person is infected.
    	//Loop through the contacts.
    	//Decide if a contact is susceptible by whether they are infected or not.
    	//Compare a random number to the spread rate.
    	//If person is infected track the number of days they have been infected.
    	//If infected for enough days then compare random number to death rate to see if they are alive.
    	//If infected for enough days then not infected anymore.
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

