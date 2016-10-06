static boolean isPalindrome(String s) {
	for (int x = 0; x < s.length() / 2; x++)
		if (s.charAt(x) != s.charAt(s.length() - x - 1))
			return false;
	return true;
}
