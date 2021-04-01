public class GraphicCard extends Component {
	protected String conCpuGrCa;
	static int grCaCount = 1;

	public GraphicCard(String id, String type, String name, String manufacturerInformation, String conCpuGrCa) {
		super(id, type, name, manufacturerInformation);
		this.conCpuGrCa = conCpuGrCa;
		grCaCount++;
	}

	public boolean connect(Cpu other) {
		return this.conCpuGrCa.equalsIgnoreCase(other.conCpuGrCa);
	}

	@Override
	public String toString() {
		return "GraphicCard{" +
				"id=" + id +
				", type='" + type + '\'' +
				", name='" + name + '\'' +
				", manufacturerInformation='" + manufacturerInformation + '\'' +
				", conCpuGrCa='" + conCpuGrCa + '\'' +
				'}';
	}
}
