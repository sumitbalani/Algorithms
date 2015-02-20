
public class hashMap {
	
	//visual representation of map
	// [ key ] -> {[key],[value]}
	// [ key ] -> {[key],[value]}
	// [ key ] -> {[key],[value]}
	
	public hashMapData[] mapArray;
	
	public hashMap (int size){
		//:TODO should be variable size 
		this.mapArray = new hashMapData[size];
	}
	
	public void put(int key, int value){
		int position = key%this.mapArray.length;

		while(mapArray[position] !=null){
			if(position < mapArray.length-1)
				position++;
			else
				position = 0;
		}
		
		mapArray[position] = new hashMapData(key, value);
			
		}
		
	public int get(int key){
		int count = 0;
		int position = key%this.mapArray.length;
		while(mapArray[position].getKey() != key)
		{
			if(position < mapArray.length-1)
				position++;
			else
				position = 0;
			
			count++;
			if(count>mapArray.length){
				throw new IllegalArgumentException("Not in map");
			}
			
		}	
		return mapArray[position].getValue();
	}

}	
