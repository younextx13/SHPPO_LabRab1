public class MotherBoard extends Component {
	protected String conCpuMoBo;
	protected String conMoBoRam;
	protected String conMoBoRom;
	static int moBoCount = 1;

	public MotherBoard(String id, String type, String name, String manufacturerInformation, String conCpuMoBo,
			String conMoBoRam, String conMoBoRom) {
		super(id, type, name, manufacturerInformation);
		this.conCpuMoBo = conCpuMoBo;
		this.conMoBoRam = conMoBoRam;
		this.conMoBoRom = conMoBoRom;
		moBoCount++;
	}

	public boolean connect(Cpu other) {
		return this.conCpuMoBo.equals(other.conCpuMoBo);
	}
	
	public boolean connect(Ram other) {
		return this.conMoBoRam.equals(other.conMoBoRam);
	}
	
	public boolean connect(Rom other) {
		return this.conMoBoRom.equals(other.conMoBoRom);
	}

	@Override
	public String toString() {
		return "MotherBoard{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuMoBo='" + conCpuMoBo + '\'' +
				", conMoBoRam='" + conMoBoRam + '\'' +
				", conMoBoRom='" + conMoBoRom + '\'' +
				'}';
	}
}
