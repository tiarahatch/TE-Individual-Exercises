package com.techelevator;

public class HomeworkAssignment {
	
	private int earnedMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;
	
	public HomeworkAssignment (int possibleMarks) {
		this.possibleMarks = possibleMarks;
		
	}
	
	public int getEarnedMarks() {
		return earnedMarks;
	}
	public void setEarnedMarks(int earnedMarks) {
		this.earnedMarks = earnedMarks;
	}
	public String getSubmitterName() {
		return submitterName;
	}
	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}
	public int getPossibleMarks() {
		return possibleMarks;
	}
	public String getLetterGrade() {
		double score = (double) earnedMarks / (double) possibleMarks * 100;
		if (score >= 90) {
			return "A";
		}
		else if (score >= 80) {
			return "B";
		}
		else if (score >= 70) {
			return "C";
		}
		else if (score >= 60) {
			return "D";
		}
		else {
			return "F";
		}
	
	}
}
