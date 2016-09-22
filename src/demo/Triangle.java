package demo; 

public class Triangle {
// private String type;
// private int height;
	private Point pointa;
	private Point pointb;
	private Point pointc;
	/**
	 * @return the pointa
	 */
	public Point getPointa() {
		return pointa;
	}
	/**
	 * @param pointa the pointa to set
	 */
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	/**
	 * @return the pointb
	 */
	public Point getPointb() {
		return pointb;
	}
	/**
	 * @param pointb the pointb to set
	 */
	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}
	/**
	 * @return the pointc
	 */
	public Point getPointc() {
		return pointc;
	}
	/**
	 * @param pointc the pointc to set
	 */
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
 
 
 /**
 * @return the height
 */
//public int getHeight() {
//	return height;
//}
//public Triangle(String type,int height){
//	this.type= type;
//	
//	 
// }
//public Triangle(int height){
//	this.height=height;
//}
	public void draw(){
		System.out.println(getPointa().getX()+ " "+"," +getPointa().getY());
		System.out.println(getPointb().getX()+ " "+"," +getPointa().getY());
		System.out.println(getPointc().getX()+ " "+"," +getPointa().getY());

		
	}
//	/**
//	 * @return the type
//	 */
//	public String getType() {
//		return type;
//	}
//	/**
//	 * @param type the type to set
//	 */
////	public void setType(String type) {
////		this.type = type;
////	}

 
}

