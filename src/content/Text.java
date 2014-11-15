package content;



public class Text implements Content{

	protected String text;
	
	public Text( String text){
		this.text = text;
	}
	public String toString(){
		return text;
	}
	public void setText(String s){
		 text = s;		
	}
}
