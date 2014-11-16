package letter;

import content.Content;
import content.Money;
import content.Text;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();
		
		//Creating the city
		City city = new City("LILLE");
		
		s.append("----------------------------------------\n");
		s.append("\nCity name : ");
		s.append(city.name);
		s.append("\n\n");
		s.append(city.toString());
		//Creating and initializing city inhabitants
		
		Inhabitant[] inhab = new Inhabitant[100]; 	
		
		for(int i=0;i<100;i++){
			inhab[i]= new Inhabitant(city,"inhabitant_"+i,10000);			
		}
		
		//Creating Letters
		Letter inside ;
		Letter[] l = new Letter[20];
		
		//---------DAY 1 --------------
		//s.append("\n----------DAY 1---------\n\n");
		//s.append(city.toString());
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
		s.append(city.toString());		
		//---------DAY 2----------
		//s.append("\n----------DAY 2---------\n\n");
		for(int j=0;j<20;j++)
		{
			//Initial-izing letters
			Content content = new Text("Blabla");
			inside = new SimpleLetter(inhab[j],inhab[j+1],(Text)content);
			l[j] = new Urgent(inside);
			
				
			//Sending letters
			city.sendLetter(l[j]);
		}
		
		city.distributeLetters();
		s.append(city.toString());
		s.append("----------------------------------------\n");
		System.out.print(s.toString());
		
	

	}
}
