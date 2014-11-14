package content;


public class Money implements Content{
	
	private final int amount;
	
	public Money(int amount){
		if(amount < 0) 
			throw new IllegalArgumentException();
		this.amount = amount ;
	}
	public int getAmount() {
		return amount;
	}
	public String toString(){
		return amount+"$";	
	}

}
