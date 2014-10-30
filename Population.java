/**
* A population class to be part of an SIR simulation with a discrete number
* of acquaintances of each member of the population.
* @author Matthew Bardoe
* @author Ben Birney
* @author Yong
* @author Channy
* @author Yonghyun Lee
* @version 0.1
* @date 10/21/14
*/

public class Population  {
 private int populationSize;
 private Person[] people;
<<<<<<< HEAD
=======
 private int numContacts;
>>>>>>> 33c4eebee2eefd30c9d7ea5fdbe26427f1419696
 
 /**
 * A constructor method for the Population class 
 * @param populationSize an int that indicates the size of the population
 * @param numContacts an int that indicates the number of contacts each member of the population will have.
 */
 public Population(int populationSize, int numContacts){
    this.populationSize=populationSize;
    people = new Person[populationSize];
    for( int i = 0 ; i< this.populationSize ; i++)
    {
      people[i]=new Person(numContacts);
    }
    this.numContacts=numContacts;
  }
 
 
 
 /**
 * This method creates the acquaintances for all the
 * people in the population.
 */
<<<<<<< HEAD
<<<<<<< HEAD
 private void createContacts()
 {
   
 }
=======
 private void createContacts(int numContacts);
=======
 private void createContacts(int numContacts)
 {
 	Person currentPerson, friend;
 	int friendIndex;
>>>>>>> 9a937a9cc666f61d07f4fc7c97145ac2f61799e7
   for (int i = 0; i<populationSize; i++)
   {
     currentPerson = people[i];
       for (int j = 0; j<numContacts; j++)
      {
      	// randomly generate an integer from 
        //friendIndex = Math.random();
        //== addContact;
       
      }
   }
<<<<<<< HEAD
>>>>>>> 33c4eebee2eefd30c9d7ea5fdbe26427f1419696

=======
}
>>>>>>> 9a937a9cc666f61d07f4fc7c97145ac2f61799e7
 /**
 * This function returns the number of people that are 
 * infected in the population.
 * @return int the number of infected people in the population.
 */
 public int numberInfected();
 {
   int numInfected = 0;
   for( int i = 0 ; i< populationSize ; i++)
   {
     {
       numInfected++;
     }
   }
   return numInfected;
 }
/**
* A method to create a string that reports out
*   <ul>
*   <li>Population Size</li>
*   <li>Number Alive</li>
*   <li>Number Infected</li>
*   <li>Number Recovered</li>
*   </ul>
* @return a string that reports out the status of the population.
*/
<<<<<<< HEAD
 public String toString();
<<<<<<< HEAD
 {
   return " population size: "+this.populationsize+"/n number alive: "+this.numberAlive() +
    "/n number Infected" + this.numberInfected() + "/n numberRecovered "+ this.numberRecovered();
 }
 
=======
       return "Population Size -" + this.populationSize + "Number Infected -" + this.numberInfected + "Number Alive -" + this.numberAlive + "Number Recovered -" + this.numberRecovered;
>>>>>>> 33c4eebee2eefd30c9d7ea5fdbe26427f1419696
 
=======
 public String toString()
 {
              return "Population Size -" + this.populationSize + "Number Infected -" + this.numberInfected() + "Number Alive -" + this.numberAlive() + "Number Recovered -" + this.numberRecovered();
 }
>>>>>>> 9a937a9cc666f61d07f4fc7c97145ac2f61799e7
 public static void main(String[] args)
 {
  // Create a population of size 1000 where everyone knows
  // 5 other people.
  Population population = new Population(100,5);
  Person larry = population.getPerson(30);
  System.out.println(larry);
<<<<<<< HEAD
<<<<<<< HEAD
  System.out.println(population.numberInfected());
  System.out.println(population.numberAlive());
  System.out.println(population.numberRecovered());
=======
>>>>>>> 33c4eebee2eefd30c9d7ea5fdbe26427f1419696
  System.out.println(population.toString());
=======
  System.out.println(population);
>>>>>>> 9a937a9cc666f61d07f4fc7c97145ac2f61799e7
 }
}
