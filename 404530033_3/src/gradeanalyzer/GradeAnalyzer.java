package gradeanalyzer;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class Count {
	String name;
	int gra;

	Count() {
	}

	Count(String _name, int _gra) {
		this.name = _name;
		this.gra = _gra;
	}

	public String toString() {
		return this.name + "=" + this.gra;
	}
}

public class GradeAnalyzer {
	double Tnum = 0, SD = 0, Avg = 0, Getnum = 0, Sd = 0;
	int input;
	ArrayList<Double> NumScore = new ArrayList<Double>();
	Count[] Gradenum = new Count[11];
	boolean FirstTime = true;

	static boolean isValid(double aGrade) {
		if (aGrade >= 0 && aGrade <= 110)
			return true;
		return false;
	}

	void addGrade(double aGrade) {
		// Good, +2.
		if (FirstTime) {
			Gradenum[0] = new Count("A+", 0);
			Gradenum[1] = new Count("A", 0);
			Gradenum[2] = new Count("A-", 0);
			Gradenum[3] = new Count("B+", 0);
			Gradenum[4] = new Count("B", 0);
			Gradenum[5] = new Count("B-", 0);
			Gradenum[6] = new Count("C+", 0);
			Gradenum[7] = new Count("C", 0);
			Gradenum[8] = new Count("C-", 0);
			Gradenum[9] = new Count("D", 0);
			Gradenum[10] = new Count("F", 0);
			FirstTime = false;
		}
		if (!isValid(aGrade)) {
			return;
		}
		NumScore.add(aGrade);
		Tnum += aGrade;
		input++;

		if (aGrade <= 110 && aGrade >= 98) {
			Gradenum[0].gra++;
		} else if (aGrade < 98 && aGrade >= 92) {
			Gradenum[1].gra++;
		} else if (aGrade < 92 && aGrade >= 90) {
			Gradenum[2].gra++;
		} else if (aGrade < 90 && aGrade >= 88) {
			Gradenum[3].gra++;
		} else if (aGrade < 88 && aGrade >= 82) {
			Gradenum[4].gra++;
		} else if (aGrade < 82 && aGrade >= 80) {
			Gradenum[5].gra++;
		} else if (aGrade < 80 && aGrade >= 78) {
			Gradenum[6].gra++;
		} else if (aGrade < 78 && aGrade >= 72) {
			Gradenum[7].gra++;
		} else if (aGrade < 72 && aGrade >= 70) {
			Gradenum[8].gra++;
		} else if (aGrade < 70 && aGrade >= 60) {
			Gradenum[9].gra++;
		} else if (aGrade < 60 && aGrade >= 0) {
			Gradenum[10].gra++;
		}
	}

	void analyzeGrades() {
		Avg = Tnum / input;
		for (int i = 0; i < NumScore.size(); i++) {
			Sd += (NumScore.get(i) - Avg) * (NumScore.get(i) - Avg);
		}
		SD = Math.round((Math.sqrt(Sd / input)));
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < Gradenum.length; i++) {
			s += Gradenum[i] + "\n";
		}
		return "The grade distribution is:\n\n" + s;
	}
}
