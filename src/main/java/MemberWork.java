
public class MemberWork {

	String mainSessionAttendance;
	String subSessionAttendance;
	String billProposal;

	public MemberWork(String mainSessionAttendance, String subSessionAttendance, String billProposal) {
		super();
		this.mainSessionAttendance = mainSessionAttendance;
		this.subSessionAttendance = subSessionAttendance;
		this.billProposal = billProposal;
	}

	public String getMainSessionAttendance() {
		return mainSessionAttendance;
	}

	public void setMainSessionAttendance(String mainSessionAttendance) {
		this.mainSessionAttendance = mainSessionAttendance;
	}

	public String getSubSessionAttendance() {
		return subSessionAttendance;
	}

	public void setSubSessionAttendance(String subSessionAttendance) {
		this.subSessionAttendance = subSessionAttendance;
	}

	public String getBillProposal() {
		return billProposal;
	}

	public void setBillProposal(String billProposal) {
		this.billProposal = billProposal;
	}
}
