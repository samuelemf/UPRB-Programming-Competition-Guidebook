public static long fac(int n) {
	long total = 1;
	for (int x = n; x > 1; x--)
		total *= n;
	return total;
}