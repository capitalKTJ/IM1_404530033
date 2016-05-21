/*
 * [A]100
 * [TA's Advise]
 * 1. 沒什麼太大的問題, 很棒!
 * */


package gradeanalyzer;

import javax.swing.JOptionPane;
import gradeanalyzer.GradeAnalyzer;

public class GradeAnalyzerTester {

	public static void main(String[] args) {
		double Score = 0;
		String Input = "";
		GradeAnalyzer GA = new GradeAnalyzer();
		// TODO Auto-generated method stub
		while (true) {
			Input = JOptionPane.showInputDialog(null, "Enter the scores ", "GradeAnalyzer", JOptionPane.PLAIN_MESSAGE);
			if (Input.equalsIgnoreCase("q")) {
				break;
			}
			try {
				GA.addGrade(Double.parseDouble(Input));
			} catch (Exception e) {
				System.out.println("please enter again");
			}
		}

		// 缺少判斷是否個數<2, -2.
		GA.analyzeGrades();
		// Output
		JOptionPane.showMessageDialog(null,
				"You entered " + GA.input + " Valid grades from 0 to 110.  Invalid grades are ignored! \n"
						+ "The average = " + (int) GA.Avg + " with a standard deviation = " + (int) GA.SD + "\n" + GA,
				"GradeAnalyzer Result", JOptionPane.PLAIN_MESSAGE);

	}

}
