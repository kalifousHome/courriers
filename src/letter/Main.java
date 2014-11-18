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
		City city = new City("LILLE");
		
		System.out.print("----------------------------------------\n");
		System.out.print("\nCity name : ");
		System.out.print(city.name);
		System.out.print("\n\n");
		System.out.print(city.toString());
		city.distributeLetters();

		//Creating and initializing city inhabitants
		
		Inhabitant[] inhab = new Inhabitant[100]; 	
		
		for(int i=0;i<100;i++){
			inhab[i]= new Inhabitant(city,"inhabitant_"+i,10000);			
		}
		
		//Creating Letters
		Letter inside ;
		Letter[] l = new Letter[20];
		
		//---------DAY 1 --------------
		for(int j=0;j<20;j++)
		{
			//Initializing letters
			Content content = new Money(j*100);
			inside = new PromissoryLetter(inhab[j],inhab[j+1],(Money)content );	
			l[j] = new Urgent(inside);
			//Sending letters
			city.sendLetter(l[j]);
	
			
		}
		
		//Distributing the promissory letters
		city.distributeLetters();


		//---------DAY 2----------
		for(int j=0;j<20;j++)
		{
			//Initial-izing letters
			Content content = new Text("Blabla");
			inside = new SimpleLetter(inhab[j],inhab[j+1],(Text)content);
			l[j] = new Urgent(inside);
			
				
			//Sending letters
			city.sendLetter(l[j]);
		
			}
		
		
		/* Print the trace and flush the StringBuilder */
	
		city.distributeLetters();
		System.out.print("----------------------------------------\n");

	}
}