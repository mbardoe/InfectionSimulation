/**
* This class is part of a simulation of the spread of a virus 
* through a population. It uses the SIR model to
* model the spread of virus through a population.
* @author Ginny Nie
* @version 0.1
* 
*/

public class Person  {
	private boolean isInfected;
	private boolean isAlive;
	private boolean isRecovered;
	private Virus[] virus; 

	private Person[] contacts;
    private int numContacts;

	public Person(int numContacts) {
		isInfected=false;
		isAlive=true;
		isRecovered=true;
        contacts=new Person[numContacts];
        this.numContacts=numContacts;
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
	public void setDaysInfected (int day1, int day2)
	{
		daysInfected= day2 - day1;
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
    public int getNumContacts()
    {
    	return numContacts;
    }

    public Person getContacts()
    {
    	return contacts;
    }
    public void addContact(Person friend)
    {
    	for (int i =0; i<contacts.length; i++)
    	{
    		if (contact[i]==null)
    		{

    			contact[i]=friend;
    			break; 
    		}
    	}
    }

    public void spreadVirus()
    {
    	if (isInfected==true)
    	{
    		for (int i=0; i<contacts.length; i++)
    		{
    			if (contact[i].susceptible==true)
    			{
    				(Math.floor(Math.random() * 100.0))*(spreadrate)=//some number
    				if (/*some number*/<)
    				{
    					if (isInfected==true)
    				{
    					(Math.floor(Math.))
    				}
    				}
    				
    			} 

    		}
    	
    	//Decide if a contact is susceptible by whether they are infected or not.
    	//Compare a random number to the spread rate.
    	//If person is infected track the number of days they have been infected.
    	//If infected for enough days then compare random number to death rate to see if they are alive.
    	//If infected for enough days then not infected anymore.


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

