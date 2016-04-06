package eastertester;

public class Easter {

	public String calculateEaster(int year) {
		int a, b, c, d, e, k = 0, p = 0, q = 0, N, M, n1, n2;

		a = year % 19;
		b = year % 4;
		c = year % 7;
		k = year / 100;// Math.floor(), -2
		p = (13 + 8 * k) / 25;
		q = k / 4;
		M = (15 - p + k - q) % 30;
		N = (4 + k - q) % 7;
		d = (19 * a + M) % 30;
		e = (2 * b + 4 * c + 6 * d + N) % 7;
		if (d + e <= 9) {
			n1 = 22 + d + e;
			return "In " + year + ", Easter Sunday is: month = 3 and day = " + n1;
		} else {
			n2 = d + e - 9;

			// 缺少兩個判斷式, 實作不完全喔! -5
			// if d = 29 and e = 6, replace 26 April with 19 April
			// if d = 28, e = 6, and (11M + 11) mod 30 < 19, replace 25 April
			// with 18 April

			return "In " + year + ", Easter Sunday is: month = 4 and day = " + n2;
		}

	}
}
