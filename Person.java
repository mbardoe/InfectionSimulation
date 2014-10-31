/**
* This class is part of a simulation of the spread of a virus 
* through a population. It uses the SIR model to
* model the spread of virus through a population.
* @author Ginny Nie, Charles, Singhei 
* @version 0.1
* 
*/

public class Person  {
	private boolean isInfected;
	private boolean isAlive;
	private boolean isRecovered;
	private Virus virus; 
    private int daysInfected;
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
	public void setInfected(boolean infected)
	{
		this.isInfected=infected;
	}
	/**
	* A setter method for the alive status of a person.
	* @param alive a boolean describing whether a person is alive.
	*/
    public void setAlive(boolean alive)
	{
		this.isAlive=alive;
	}
	/**
	* A setter method for the recovered status of a person.
	* @param recovered a boolean describing whether a person is recovered.
	*/
	public void setRecovered (boolean recovered)

	{
		this.isRecovered=recovered;
	}

	/**
	* A getter method for the infection status of person.
	* @return boolean indicating the infection state of the person.
	*/
	public boolean infected()
	{
		return isInfected;
	}
	/**
	* A getter method for the recovered status of person.
	* @return boolean indicating the recovered state of the person.
	*/
    public boolean recovered()
    {
    	return isRecovered;
    }
    /**
	* A getter method for the living status of person.
	* @return boolean indicating the living status of the person.
	*/
    public boolean alive()
    {
    	return isAlive;
    }
    /**
	* A getter method for the number of contacts in person's contact array.
	* @return int indicating the number  of contacts in the person's contact array. 
	*/
    public int getNumContacts()
    {
    	return numContacts;
    }
    /**
	* A getter method for the susceptible status of person.
	* @return boolean indicating the whether or not the  person is susceptible.
	*/
    public boolean susceptible()
    {
        return (isAlive)&&(!isInfected)&&(!isRecovered);
    }
    /** 
    * A setter method for the virus.
    */
    public void setVirus(Virus virus)
    {
        this.virus=virus;
    }
    /**
	* A getter method for the contacts  of a person.
	* @return array consisting of the contacts  of a person.
	*/
    public Person[] getContacts()
    {
    	return contacts;
    }
    /**
    * A method for adding contacts to a person's contact list.
    */

    public void addContact(Person friend)
    {
    	for (int i =0; i<contacts.length; i++)
    	{
    		if (contacts[i]==null)
    		{

    			contacts[i]=friend;
    			break; 
    		}
    	}
    }
    /**
	* A  method for spreading the virus through the contacts of a person.
	*/
    public void spreadVirus()
    {
    	if (isInfected==true)
    	{
    		for (int i=0; i<contacts.length; i++)
    		{
    			if (contacts[i].susceptible()==true)
    			{

    				if (Math.random()<virus.getSpreadRate())
    				{
    					contacts[i].setInfected(true);
                        contacts[i].setVirus(virus);

    				}
    				
    			} 

    		}

            daysInfected++;
            if (daysInfected>virus.getInfectiousDays())
            {
                if(Math.random()<virus.getDeathRate())
                {
                    //He died
                    setInfected(false);
                    setAlive(false);
                    setRecovered(false);
                }
                else
                {
                    // He lived!
                    setInfected(false);
                    setAlive(true);
                    setRecovered(true);
                }
            }

    	}

    }



	/**
	* This main method is meant to test some of the basic implementations
	* of this class.
	*/
	public static void main(String[] args){
		Person person = new Person(5);
		Person friend = new Person(5);
		person.addContact(friend);
		System.out.println(person.getNumContacts());
		System.out.println(person.getContacts());
		System.out.println(friend.getContacts());
		

	}
	
}

