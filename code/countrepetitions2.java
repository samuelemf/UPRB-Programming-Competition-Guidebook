public static void main(String[] arguments) {
	Integer[] arr = { 1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 5, 5, 5,
		 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6 };
	ArrayList<Integer> list = new ArrayList<Integer>();
	for (Integer i : arr)
		list.add(i);
	HashMap<Integer, Integer> map = countRepeatedElements(list);
	Set<Integer> set = map.keySet();
	for (Integer key : set)
		if (map.get(key) > 1)
			System.out.println(String.format(
				"%d was repeated %d times", key, map.get(key)));
}
