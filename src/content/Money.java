package content;


public class Money implements Content{
	
	private final int amount;
	
	public Money(int amount){
		this.amount = amount ;
	}
	public int getAmount() {
		return amount;
	}

}
