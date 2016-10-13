static int getBit(long num, int position) {
	return (int) (num >> position & 1);
}

public static void main(String[] arguments) {
	char[] arr = "abcd".toCharArray();
	long x;
	int y;
	for (x = 0; x < (2 << arr.length - 1); x++) {
		for (y = 0; y < arr.length; y++)
			if (getBit(x, y) == 1)
				System.out.print(arr[y]);
		System.out.println();
	}
}
