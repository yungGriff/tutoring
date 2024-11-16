public static int recursionPrac(int n) {
	if(n <= 1) {
		return 1;
	}
	return n * recursionPrac(n-1);
}
