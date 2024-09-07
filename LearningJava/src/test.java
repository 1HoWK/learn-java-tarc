
public class test {

	public static String[] uniqueNames(String[] names1, String[] names2) {
//		throw new UnsupportedOperationException("Waiting to be implemented.");
		int a = 0;
		int b = 0;
		int c = 0;
		String[] names3 = new String[4];
		for (int i = 0; i < names1.length; i++) {
			for (int j = 0; j < names2.length; j++) {
				if (names1[i] != names2[j]) {
					a = 0;
					c = 0;
					for (int h = 0; h < names3.length; h++) {
						if (names3[h] != names2[j]) {
							a++;
							if (a == 4) {
								names3[b] = names2[j];
								b++;
							}
							if (names3[h] != names1[i]) {
								c++;
								if (c == 4) {
									names3[b] = names1[i];
									b++;
								}
							}
						}
					}
				}
			}
		}
		return names3;
	}

	public static void main(String[] args) {
		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };

		System.out.println(String.join(", ", test.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
	}

}