
public class Shape {
	
	float length;
	float width;
	float height;
	float area;
	
	
	public Shape(float length, float width, float height) {
	
		this.length = length;
		this.width = width;
		this.height = height;
	}
public void  Square(){
	area=this.length*this.length;
	System.out.println("area of square:"+area);

	}
public void  rectangle(){
	area=this.width*this.height;
	System.out.println("area of rectangle:"+area);

	}
public void  parallelogram(){
	area=this.width*this.height;
	System.out.println("area of parallelogram:"+area);
}
public void  rhombus(){
	area=this.width*this.length;
	System.out.println("area of rhombus:"+area);
	}
public void  Trapezium(){
	area=(float) (((this.width+this.length)*this.height)/2);
	System.out.println("area of trapezium:"+area);

	}
}
