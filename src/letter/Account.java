package letter;
/**
 * @author Julien Leclercq
 * @author 
 *
 */
public class Account {
	

	//ATTRIBUTS 
	protected int balance;
	
	//CONSTRUCTORS
	
	/**
	 * Constructs a new Account with a balance of 0
	 */
	public Account(){
		this.balance = 0;
	}
	
	/**
	 * Constructs a new Account with the specified int as the balance
	 * @param balance the balance 
	 */
	public Account(int balance){
		this.balance = balance;
	}
	
	//METHODS
	
	/**
	 * getter for the balance of this Account
	 * @return the balance of this Account
	 */
	public int getBalance(){
		return this.balance;
	}
	
	/**
	 * Debit the specified amount of money from this Account
	 * @param amount - the positive amount of money to debit
	 * @throws IllegalArgumentException if amount < 0
	 */
	public void debit(int amount){
		if (amount<0)
			throw new IllegalArgumentException();
		this.balance = this.balance - amount;
	}
	
	/**
	 * Credit the specified amount of money from this Account
	 * @param amount - the positive amount of money to credit
	 * @throws IllegalArgumentException if amount < 0
	 */
	public void credit(int amount){
		if(amount<0){
			throw new IllegalArgumentException();
		}else
			this.balance += amount;
	}
}