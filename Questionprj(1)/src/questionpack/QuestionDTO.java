package questionpack;

public class QuestionDTO {
	private String name;
	private String id;
	private String pw;
	private String grade;
	private int best_score;
	
	
	
	
	
	



	public QuestionDTO(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	

	public QuestionDTO(String user_name, String grade, int best_score) {
		this.name = user_name;
		this.grade = grade;
		this.best_score = best_score;
	}



	String getGrade() {
		return grade;
	}



	int getBest_score() {
		return best_score;
	}



	String getName() {
		return name;
	}

	String getId() {
		return id;
	}

	String getPw() {
		return pw;
	}
	
	
	
	
	
	
	
	
	
	
	
}




