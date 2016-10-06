static <E> HashMap<E, Integer> countRepeatedElements(ArrayList<E> list) {
	HashMap<E, Integer> map = new HashMap<E, Integer>();
	Integer count;
	for (E element : list) {
		count = map.get(element);
		if (count == null)
			count = 0;
		count++;
		map.put(element, count);
	}
	return map;
}
