package di_p;

public class Camera {
	String name;
	int pixel;
	
	public Camera() {
		System.out.println("Camera 기본 생성자");
	}
	
	public Camera(String name, int pixel) {
		super();
		this.name = name;
		this.pixel = pixel;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setName(): " + name);
		this.name = name;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		System.out.println("setPixel(): " + pixel);
		this.pixel = pixel;
	}
	@Override
	public String toString() {
		return "Camera [name=" + name + ", pixel=" + pixel + "]";
	}
}
