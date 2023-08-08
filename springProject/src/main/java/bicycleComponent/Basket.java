package bicycleComponent;

public class Basket {
	String name, kind;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Basket [name=" + name + ", kind=" + kind + "]";
	}
}
