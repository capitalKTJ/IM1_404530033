/*
 * [A]93
 * [TA's Advise]
 * 1.�D�بèS���n�D�n�gScanner, �Ш̷��D�حn�D�@���g, �Y����@�~�Y�Q�HScanner�i�漶�g�аȥ��g�ҥ~�B�z, ���ͨҥ~���B�z�N�H�{�����~�i�榩��.
 * 2.�`�����ƾ�method�i�H�O�@�U: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 3.����i�H���զbjavadoc���g�@�ǵ���.
 * 4.��@�t��k�n�T�P�_�U����������.
 * 5.���g���i�B�F, �~��[�o!
 * */

package eastertester;

import java.util.Scanner;

public class EasterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Easter easter = new Easter();
		System.out.println("Enter a year to calculate Ester Sunday :");
		Scanner t = new Scanner(System.in);

		// �o��function call���G���I�h�l��.
		int input = getResult(t);
		System.out.println(easter.calculateEaster(input));
	}

	private static int getResult(Scanner t) {
		// TODO Auto-generated method stub
		return t.nextInt();
	}

}
