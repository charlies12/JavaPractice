package myShapes;

public class Rectangle {
	// default values if there are no arguments
	double width = 1;
	double height = 1;
	
	Rectangle(){
		
	}
	Rectangle(double newWidth, double newHeight){
		width = newWidth;
		height = newHeight;
	}
	// Return area
	double getArea() {
		return width * height;
	}
	// Return perimeter
	double getPerimeter() {
		return 2 * width + 2 * height;
	}
	// Set new width and height
	void setWidthAndHeight(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	

}
