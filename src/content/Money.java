package content;
/*
 * Class representing an amount of money as a content of a letter.
 */
public class Money implements Content{
	/*
	 *  The amount of money contained 
	 */
	private final int amount;
	
	public Money(int amount) throws IllegalArgumentException {
		/* A letter cannot contain a negative amount of money */
		if(amount < 0) 
			throw new IllegalArgumentException();
		this.amount = amount ;
	}
	/*
	 * @return return the amount of money contained 
	 */
	public int getAmount() {
		return amount;
	}
	/*
	 *@return return as the amount of money contained a readable text 
	 *
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		
		StringBuilder s = new StringBuilder();
		s.append("with amount ");
		s.append(amount);
		s.append('$');
		return s.toString();	
	}

}
