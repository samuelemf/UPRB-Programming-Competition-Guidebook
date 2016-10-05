public static BigInteger fac(BigInteger n) {
	BigInteger total = BigInteger.ONE, x;
	for (x = n; x.compareTo(BigInteger.ONE) == 1; x = x.subtract(BigInteger.ONE))
		total = total.multiply(n);
	return total;
}