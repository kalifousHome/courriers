package letter;

import content.Content;

public abstract class Letter implements Content{ //implements Content{

	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected Content content;
	
	public abstract String toString();
	abstract int getCost();
	/**
	 * credite le compte pour une promissory, affiche le texte d'une simple etc...
	 */
	abstract void doAction();
	
	public Letter(Inhabitant sender, Inhabitant receiver, Content content){
		this.sender = sender;
		this.receiver = receiver;
		this.content = content;
	}
	public Inhabitant getSender(){
		return sender;
	}
	public Inhabitant getReceiver(){
		return receiver;
	}
	public Content getContent(){
		return content;
		}
	public abstract String getType();
}

