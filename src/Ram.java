public class Ram extends Component {
	protected String conCpuRam;
	protected String conMoBoRam;
	static int ramCount = 1;

	public Ram(String id, String type, String name, String manufacturerInformation, String conCpuRam, String conMoBoRam) {
		super(id, type, name, manufacturerInformation);
		this.conCpuRam = conCpuRam;
		this.conMoBoRam = conMoBoRam;
		ramCount++;
	}

	public boolean connect(Cpu other) {
		return this.conCpuRam.equalsIgnoreCase(other.conCpuRam);
	}
	
	public boolean connect(MotherBoard other) {
		return this.conMoBoRam.equalsIgnoreCase(other.conMoBoRam);
	}

	@Override
	public String toString() {
		return "Ram{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuRam='" + conCpuRam + '\'' +
				", conMoBoRam='" + conMoBoRam + '\'' +
				'}';
	}
}
