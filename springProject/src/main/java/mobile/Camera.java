package mobile;

public class Camera {
	String lensKinds, cameraKinds;
	int iso;
	
	public void setLensKinds(String lensKinds) {
		this.lensKinds = lensKinds;
	}
	public void setCameraKinds(String cameraKinds) {
		this.cameraKinds = cameraKinds;
	}
	public void setIso(int iso) {
		this.iso = iso;
	}
	@Override
	public String toString() {
		return "Camera [lensKinds=" + lensKinds + ", cameraKinds=" + cameraKinds + ", iso=" + iso + "]\n";
	}
}
