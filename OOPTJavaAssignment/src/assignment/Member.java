package assignment;

import java.util.ArrayList;

public class Member {
	private String memberName, memberID;
	private int memberNo;
	private static int nextmemberNo = 1001;

	static ArrayList<Member> memberlist = new ArrayList<>();
	static Member[] members = new Member[1000];
	static {
		memberlist.add(new Member("Kenny Ng", 29, 10));
		memberlist.add(new Member("Danial Hakim", 2, 1));
		memberlist.add(new Member("Nathaniel", 15, 7));
		memberlist.add(new Member("Selena Tan", 18, 2));
		memberlist.add(new Member("Maxman", 15, 4));

		for (int i = 0; i < memberlist.size(); i++) {
			members[i] = memberlist.get(i);
		}
	}

	public Member() {

	}

	public Member(String memberName, int date, int month) {
		this.memberNo = nextmemberNo;
		this.memberName = memberName;
		memberID = String.format("%s%d%02d%02d", "M", memberNo, date, month);
		nextmemberNo++;
	}

	// getters
	public String getMemberName() {
		return memberName;
	}

	public String getMemberID() {
		return memberID;
	}

	// setters
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	// toString
	public String toString() {
		return "Member ID   : " + memberID + "\nMember Name : " + memberName;
	}

	// display all registered members
	public static void checkStatus() {
		for (int i = 0; i < memberlist.size(); i++) {
			System.out.print("Member " + "No " + (i + 1));
			System.out.println("\n" + members[i] + "\n");
		}
	}

	// display member's membership
	public static String validateID(String memberID) {
		String memberNAME = "";
		if (memberID.length() == 9) {
			for (int i = 0; i < memberlist.size(); i++) {
				if (memberID.equals(members[i].getMemberID())) {
					memberNAME = members[i].getMemberName();
				}
			}
		}
		return memberNAME;
	}

	// edit member Name
	public static int editMemberName(String memberID, String memberName) {
		int value = 0;
		for (int i = 0; i < memberlist.size(); i++) {
			if (memberID.equals(members[i].getMemberID())) {
				members[i].setMemberName(memberName);
				value++;
			}
		}
		return value;
	}

	// delete members
	public static String deleteMember(String memberID) {
		// delete arrayList
		for (int i = 0; i < memberlist.size(); i++) {
			if (memberID.equals(members[i].getMemberID())) {
				memberlist.remove(i);
				// add new arrayList
				for (int j = 0; j < memberlist.size(); j++) {
					members[j] = memberlist.get(j);
				}
				return "DELETED SUCCCESSFULLY !!!!\nGo and have a look";
			}
		}
		return "NOTHING DELETED\nWrong member ID or Invalid member ID\n";
	}

}
