/*
 * [A]93
 * [TA's Advise]
 * 1.題目並沒有要求要寫Scanner, 請依照題目要求作撰寫, 若之後作業若想以Scanner進行撰寫請務必寫例外處理, 產生例外未處理將以程式錯誤進行扣分.
 * 2.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3.之後可以嘗試在javadoc中寫一些註解.
 * 4.實作演算法要確判斷下的夠完全喔.
 * 5.姿君有進步了, 繼續加油!
 * */

package eastertester;

import java.util.Scanner;

public class EasterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Easter easter = new Easter();
		System.out.println("Enter a year to calculate Ester Sunday :");
		Scanner t = new Scanner(System.in);

		// 這個function call似乎有點多餘喔.
		int input = getResult(t);
		System.out.println(easter.calculateEaster(input));
	}

	private static int getResult(Scanner t) {
		// TODO Auto-generated method stub
		return t.nextInt();
	}

}
