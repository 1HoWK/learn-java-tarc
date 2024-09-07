package practical4;

public class Owner {
	private String icNo;
	private String name;

	public Owner() {
		
	}

	public Owner(String icNo, String name) {
		this.icNo = icNo;
		this.name = name;
	}

	public String getIcNo() {
		return icNo;
	}

	public void setIcNo(String icNo) {
		this.icNo = icNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return String.format("%-20s %-12s", name, icNo);
	}

}
