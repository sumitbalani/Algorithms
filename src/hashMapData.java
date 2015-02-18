
public class hashMapData {
	private int key; 
	private int value;
	private boolean isFilled = false;
	public hashMapData (int key, int value){
		this.key = key;
		this.value = value;
		isFilled = true;
	}

	public boolean getIsFilled(){
		return this.isFilled;
	}
	
	public int getKey(){
		return this.key;
	}
	
	public int getValue(){
		return this.value;
	}
	
}
