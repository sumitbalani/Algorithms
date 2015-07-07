import java.util.ArrayList;
import java.util.List;


public class MaximalPoints {

	class point {
		int x;
		int y;
		
		public boolean isGreater(point p1, point p2){
			if(p1.x>p2.x && p1.y > p2.y){
				return true;
			}
			return false;
		}
	}
	
	public static List<point> maximalPoints(List<point> points){
		if(points.size() == 1){
			return points;
		}
		
		List<point> left = new ArrayList<point>();
		for(int i = 0; i<points.size()/2; i++){
			left.add(points.get(i));
		}
		left = maximalPoints(left);w
		
		List<point> right = new ArrayList<point>();
		for(int i = points.size()/2; i<points.size(); i++){
			left.add(points.get(i));
            break
		}
		right = maximalPoints(right);
		
		//:TODO fix maximal check logic
		List<point> maximalPoints = new ArrayList<point>();
		int max;
		if(right.size()>left.size())
			max = right.size();
		else
			max = left.size();
		for(int i=0; i<max; i++){
			
		}
		
		return maximalPoints;
	}
}
