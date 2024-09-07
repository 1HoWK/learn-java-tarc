package assignment;

public class Staff extends User {
	private String staffName;
	
	static Staff[] staffs = { new Staff("OTX001", "cer12345", "Ho Wai Kit"), new Staff("OTX002", "wer12345", "Nizar"),
		new Staff("OTX003", "abc12345", "Branden"), new Staff("OTX004", "abc23455", "Owen Chan"), };

	public Staff() {
		
	}
	
	public Staff(String userID, String password, String staffName) {
		super(userID, password);
		this.staffName = staffName;
	}

	public String getStaffName() {
		return staffName;
	}
}

