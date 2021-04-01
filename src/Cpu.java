public class Cpu extends Component {
	protected String conCpuGrCa;
	protected String conCpuMoBo;
	protected String conCpuRam;
	static int cpuCount = 1;

	public Cpu(String id, String type, String name, String manufacturerInformation, String conCpuMoBo, String conCpuGrCa,
			String conCpuRam) {
		super(id, type, name, manufacturerInformation);
		this.conCpuGrCa = conCpuGrCa;
		this.conCpuMoBo = conCpuMoBo;
		this.conCpuRam = conCpuRam;
		cpuCount++;
	}

	public boolean connect(GraphicCard other) {
		return this.conCpuGrCa.equalsIgnoreCase(other.conCpuGrCa);
	}

	public boolean connect(MotherBoard other) {
		return this.conCpuMoBo.equalsIgnoreCase(other.conCpuMoBo);
	}
	
	public boolean connect(Ram other) {
		return this.conCpuRam.equalsIgnoreCase(other.conCpuRam);
	}

	@Override
	public String toString() {
		return "Cpu{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuGrCa='" + conCpuGrCa + '\'' +
				", conCpuMoBo='" + conCpuMoBo + '\'' +
				", conCpuRam='" + conCpuRam + '\'' +
				'}';
	}
}
