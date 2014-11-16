package letter;

import content.Content;

public abstract class Letter implements Content{ 

	/* The sender of the letter */
	protected Inhabitant sender;
	/* The receiver of the letter */
	protected Inhabitant receiver;
	/* Content of the letter : a text(thanks or an aknowledgment receipt), an amount of money, of a letter */
	protected Content content;
	/*
	 *@return returns the content of the letter as a readable text.
	 * It also tells what is the time of the letter.
	 */
	public String toString() {
		{
			StringBuilder s = new StringBuilder();
			s.append(getType());
			s.append(content.toString());
			return s.toString();
		}
	}
	/*
	 *@return returns the cost of the letter 
	 */
	abstract int getCost();
	/**
	 * Executes the different actions to do on the receipt of the letter (depends on the type of the letter) 
	 */
	abstract void doAction();
	
	public Letter(Inhabitant sender, Inhabitant receiver, Content content){
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	/*
	 * @return returns the sender of the letter
	 */
	public Inhabitant getSender(){
		return sender;
	}
	/*
	 *@return returns the receiver of the letter 
	 */
	public Inhabitant getReceiver(){
		return receiver;
	}
	/*
	 *@return returns the content of the letter
	 */
	public Content getContent(){
		return content;
		}
	/* 
	 *@return returns the type of the letter as a readable text: "simple letter" , "promissory letter " etc
	 */
	public abstract String getType();
	
	
}

