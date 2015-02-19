import static org.junit.Assert.*;

import org.junit.Test;


public class HashMapTest {

	@Test(expected=IllegalArgumentException.class)
	public void notInMapTest(){
		hashMap newMap = new hashMap(1);
		newMap.put(1,10);
		newMap.get(12);
	}
	
	@Test
	public void putAndGetTest() {
		hashMap newMap = new hashMap(1);
		newMap.put(1,10);
		assertEquals(newMap.get(1), 10);
	}

}
