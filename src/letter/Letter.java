package letter;

import content.Content;

public abstract class Letter { //implements Content{

	protected Inhabitant sender;
	protected Inhabitant receiver;
	protected Content content;
	
	abstract int getCost();
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
	
	}

