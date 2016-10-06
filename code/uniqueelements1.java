static <E> HashSet<E> uniqueElements(ArrayList<E> list) {
	HashSet<E> set = new HashSet<E>();
	for (E e : list)
		set.add(e);
	return set;
}
