package letter;

import content.Content;
import content.Money;
import content.Text;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creating the city
		City city = new City("Lille");
		
		//Creating and initializing city inhabitants
		Inhabitant[] inhab = new Inhabitant[100]; 	
		for(int i=0;i<100;i++){
			inhab[i]= new Inhabitant(city,"inhabitant_"+i,10000);			
		}
		 
		
				
		//Creating Letters
		Letter[] l = new Letter[20];
		
		for(int j=0;j<20;j++)
		{
			//Initializing letters
			Content content = new Money(j*100);
			l[j]= new PromissoryLetter(inhab[j],inhab[j+1],(Money)content );	
			//Sending letters
			city.sendLetter(l[j]);
		}
		System.out.println("Day 1");
		//Distributing the promissory letters
		city.distributeLetters();
		System.out.println("Day 1");
		for(int j=0;j<20;j++)
		{
			//Initializing letters
			Content content = new Text("Blabla");
			l[j]= new SimpleLetter(inhab[j],inhab[j+1],(Text)content);	
			//Sending letters
			city.sendLetter(l[j]);
		}
		
		System.out.println("Day 1");
		city.distributeLetters();
	}

}
