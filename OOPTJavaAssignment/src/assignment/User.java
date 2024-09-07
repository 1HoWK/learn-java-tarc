package assignment;

public class User {
	private String userID;
	private String password;

	public User() {

	}
	
	public User(String userID, String password) {
		this.userID = userID;
		this.password = password;
	}

	//getters
	public String getUserID() {
		return userID;
	}

	public String getPassword() {
		return password;
	}

	//validate user login 
	public static int validate(String staffID, String password) {
		int validate = 0;
		if (staffID.toUpperCase().length() == 6) {
			if (staffID.charAt(2) == 'X') {
				for (int i = 0; i < Staff.staffs.length; i++) {
					if (staffID.equals(Staff.staffs[i].getUserID())) {
						validate++;
						if (password.equals(Staff.staffs[i].getPassword())) {
							validate++;
						}
					}
				}
			}
			if (staffID.charAt(2) == 'S') {
				for (int i = 0; i < Supervisor.supers.length; i++) {
					if (staffID.equals(Supervisor.supers[i].getUserID())) {
						validate++;
						if (password.equals(Supervisor.supers[i].getPassword())) {
							validate++;
						}
					}
				}
			}
		}
		return validate;
	}

	// display username of the logged in user
	public static String validateName(String staffID) {
		String userName = " ";
		if (staffID.charAt(2) == 'X') {
			for (int i = 0; i < Staff.staffs.length; i++) {
				if (staffID.equals(Staff.staffs[i].getUserID())) {
					userName = Staff.staffs[i].getStaffName();
				}
			}
		}
		if (staffID.charAt(2) == 'S') {
			for (int i = 0; i < Supervisor.supers.length; i++) {
				if (staffID.equals(Supervisor.supers[i].getUserID())) {
					userName = Supervisor.supers[i].getSuperName();
				}
			}
		}
		return userName;
	}
}
