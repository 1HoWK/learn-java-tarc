package assignment;

public class Supervisor extends User{
	private String superName;
	
	static Supervisor[] supers = { new Supervisor("OTS001", "12345abc", "Jerry Lim"), new Supervisor("OTS002", "12346abc", "Nigel Ng"),
			 new Supervisor("OTS003", "12347abc", "Branden"), new Supervisor("OTS004", "12348abc", "Owen Chan"), };

	public Supervisor() {
		
	}
	
	public Supervisor(String userID, String password, String superName) {
		super(userID, password);
		this.superName = superName;
	}

	public String getSuperName() {
		return superName;
	}
	
}
