package content;

/*
 * Class representing text as  the content of a letter.
*/


public class Text implements Content{
	/* The text contained */
	protected String text;
	
	public Text( String text){
		this.text = text;
	} 
	/* @return returns the text contained */
	public String toString(){
		return text;
	}
	/*
	 * @param s text to be set as contained text 
	 */
	public void setText(String s){
		 text = s;		
	}
}
