import static org.junit.Assert.*;

import org.junit.Test;


public class MaxMinTest {

	@Test
	public void findMin() {
	 int[] data = new int[]{1,10,12,12,3,15};
	 int min = MaxMin.findMin(data);
	 assertEquals(min,1);
	}
	@Test
	public void findMax() {
		int[] data = new int[]{1,10,12,12,3,15};
		int max = MaxMin.findMax(data);
		assertEquals(max,15);
	}
	@Test
	public void findMaxMin(){
		int[] data = new int[]{1,10,12,12,3,15};
		assertArrayEquals(new int[]{15,1}, MaxMin.findMaxMin(data));
	}
	@Test
	public void findMaxMinImproved(){
		int[] data = new int[]{1,10,12,12,3,15};
		assertArrayEquals(new int[]{15,1}, MaxMin.findMaxMinConstantComparisonImproved(data));
	}
	

}