public class Rom extends Component {
	protected String conMoBoRom;
	static int romCount = 1;

	public Rom(String id, String type, String name, String manufacturerInformation, String conMoBoRom) {
		super(id, type, name, manufacturerInformation);
		this.conMoBoRom = conMoBoRom;
		romCount++;
	}

	public boolean connect(MotherBoard other) {
		return this.conMoBoRom.equalsIgnoreCase(other.conMoBoRom);
	}

	@Override
	public String toString() {
		return "Rom{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conMoBoRom='" + conMoBoRom + '\'' +
				'}';
	}
}
