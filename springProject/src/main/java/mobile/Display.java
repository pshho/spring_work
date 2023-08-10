package mobile;

public class Display {
	String displayKinds, filter;
	int pixel;
	
	public void setDisplayKinds(String displayKinds) {
		this.displayKinds = displayKinds;
	}
	public void setFilter(String filter) {
		this.filter = filter;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	@Override
	public String toString() {
		return "Display [displayKinds=" + displayKinds + ", filter=" + filter + ", pixel=" + pixel + "]";
	}
}
