package demo;

import java.util.List;

public class list {

	private List<Point> points;

	/**
	 * @return the points
	 */
	public List<Point> getPoints() {
		return points;
	}

	/**
	 * @param points the points to set
	 */
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
	public void Listner(){
		for(Point point:points){
		System.out.println(point.getX()+ " "+"," +point.getY());
		

		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
