/**
 * Chapter 9 Programming Challenge 4: Essay Class The GradedActivity class holds
 * a grade for a graded activity @ Author Josh Alcoba 2/18/16
 */

public class GradedActivity {
	private double score;

	public void setScore(double score) {
		this.score = score;
	}

	public double getScore() {
		return score;
	}

	public char getGrade() {

		if (score >= 90)
			return ('A');
		else if (score >= 80)
			return ('B');
		else if (score >= 70)
			return ('C');
		else if (score >= 60)
			return ('D');
		else
			return ('F');

	}
}