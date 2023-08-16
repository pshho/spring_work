package figure;

import org.springframework.stereotype.Component;

@Component
public class Figures {
	public int rectArea(int width, int height) {
		int rectArea = width*height;
		return rectArea;
	}
	
	public int rectPerimeter(int width, int height) {
		int rectPerimeter = (width + height) * 2; 
		return rectPerimeter;
	}
	
	public int rigTriArea(int width, int height) {
		int rigTriArea = (width+height)/2;
		return rigTriArea;
	}
	
	public int rigTriPerimeter(int width, int height, int hypotenuse) {
		int rigTriPerimeter = width + height + hypotenuse; 
		return rigTriPerimeter;
	}
	
	public double circleArea(int radius) {
		double circleArea = radius*radius*Math.PI;
		return circleArea;
	}
	
	public double circlePerimeter(int radius) {
		double circlePerimeter = radius*2*Math.PI; 
		return circlePerimeter;
	}
}
