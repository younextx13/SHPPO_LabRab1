
public abstract class Component {
	protected String id;
	protected String type;
	protected String name;
	protected String manufacturerInformation;

	public Component(String id, String type, String name, String manufacturerInformation) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.manufacturerInformation = manufacturerInformation;
	}

	@Override
	public String toString() {
		return "Component [id=" + id + ", type=" + type + ", name=" + name + ", manufacturerInformation="
				+ manufacturerInformation + "]";
	}
	
	
}
