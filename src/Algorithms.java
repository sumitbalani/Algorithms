
public class Algorithms {

	public static void main(String[] Args){
		hashMap newMap = new hashMap(100);

		for(int i=0; i < 100; i++){
			newMap.put(i, i*10);
		}
		System.out.println(newMap.get(88));
		try{
			System.out.println(newMap.get(101));
		}
		catch(Exception e){
			System.out.println( "101 "+ e.getMessage());
		}
	}
	
}
