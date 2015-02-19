
public class MaxMin {

	
	public static int findMin(int[] array){
		if(array.length ==0){
			return 0;
		}
		else if(array.length == 1){
			return array[0];
		}
		else{
			int min = array[0];
			for(int i= 1; i<array.length; i++){
				if(array[i]< min)
					min = array[i];
			}
			return min;
		}
	}
	public static int findMax(int[] array){
		if(array.length ==0){
			return 0;
		}
		else if(array.length == 1){
			return array[0];
		}
		else{
			int max = array[0];
			for(int i= 1; i<array.length; i++){
				if(array[i]> max)
					max = array[i];
			}
			return max;
		}
		
	}
	public static int[] findMaxMin(int[] array){
		if(array.length<2){
			return null;
		}
		else if(array.length==2){
			if(array[0]> array[1])
				return new int[]{array[0],array[1]};
			else
				return new int[]{array[1],array[0]};
		}
		else{
			int max, min;
			if(array[0]> array[1]){ 
				max= array[0]; 
				min = array[1];
			}
			else{
				max = array[1];
				min = array[0];
			}
			
			for(int i = 2; i<array.length; i++){
				if(array[i]>max)
					max = array[i];
				else if(array[i]<min)
					min = array[i];
			}
			return new int[]{max,min};
		}
	}
	
	//comparison factor improved to 3n/2 from 2n-2
	public static int[] findMaxMinConstantComparisonImproved(int[] array){
		int min, max;
		if(array[0]> array[1]){ 
			max= array[0]; 
			min = array[1];
		}
		else{
			max = array[1];
			min = array[0];
		}
		for(int i = 2; i<array.length; i+=2){
			if(array[i]>array[i+1]){
				if(array[i]>max)
					max = array[i];
				if(array[i+1]<min)
					min = array[i+1];
			}
			else{
				if(array[i+1]>max)
					max = array[i+1];
				if(array[i]<min)
					min = array[i];
			}
			
		}
		return new int[]{max,min};
	}
	
}
