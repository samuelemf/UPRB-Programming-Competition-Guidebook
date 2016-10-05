private static ArrayList<Integer> getDivisors(int input) {
	ArrayList<Integer> list = new ArrayList<Integer>();
	list.add(1);
	int maxD = (int) Math.sqrt(input);
	for (int i = 2; i <= maxD; i++) {
		if (input % i == 0) {
			list.add(i);
			int d = input / i;
			if (d != i)
				list.add(d);
		}
	}
	list.add(input);
	return list;
}