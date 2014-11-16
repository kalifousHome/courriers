package content;

public class Money implements Content{
	
	private final int amount;
	
	public Money(int amount) throws IllegalArgumentException {
		if(amount < 0) 
			throw new IllegalArgumentException();
		this.amount = amount ;
	}
	public int getAmount() {
		return amount;
	}
	public String toString(){
		
		StringBuilder s = new StringBuilder();
		s.append("with amount ");
		s.append(amount);
		s.append('$');
		return s.toString();	
	}

}
