public class Essay extends GradedActivity {
	private double grammar;
	private double spelling;
	private double length;
	private double content;
	private double total;

	public Essay() {
		super();
		grammar = 0;
		spelling = 0;
		length = 0;
		content = 0;
	}

	public Essay(double grammar, double spelling, double length, double content) {
		this.grammar = grammar;
		this.spelling = spelling;
		this.length = length;
		this.content = content;
		super.setScore(grammar+spelling+length+content);
	}

	//mutators

	public void setScore(double grammar, double spelling, double length, double content) {
		this.grammar = grammar;
		this.spelling = spelling;
		this.length = length;
		this.content = content;
		super.setScore(grammar + spelling + length + content);
	}

	public void setGrammar(double grammar) {
		this.grammar = grammar;
	}

	public void setSpelling(double spelling) {
		this.spelling = spelling;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setContent(double content) {
		this.content = content;
	}

	public void setTotal(double g, double sp, double l, double c) {
		total = g + sp + l + c;
	}

	//accessors 
	public double getGrammar() {
		return grammar;
	}

	public double getSpelling() {
		return spelling;
	}

	public double getCorrectLength() {
		return length;
	}

	public double getContent() {
		return content;
	}

	public double getTotal() {
		return total;
	}

	public double getScore() {

		return super.getScore();
	}
}