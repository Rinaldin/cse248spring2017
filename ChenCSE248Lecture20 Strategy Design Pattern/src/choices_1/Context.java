package choices_1;

public class Context {
	private IChoice myChoice;
	
	public Context() {
	}
	
	public void setChoice(IChoice ic) {
		myChoice = ic;
	}
	
	public void doThingsBasedOnMyChoice(String str1, String str2){
		myChoice.setChoice(str1, str2);
	}
}
