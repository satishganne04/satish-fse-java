package question8;

public class CourseRegistration {

	  private String name;
	    private int registrationId;
	    private double qualifyingMarks;
	    private int courseId;
	    private boolean hostelRequired;
	    private double courseFee;
	    
	    double baseFee = 0;

	    public CourseRegistration(String name, int registrationId, double qualifyingMarks, int courseId, boolean hostelRequired) {
            this.name = name;
	        this.registrationId = registrationId;
	        this.qualifyingMarks = qualifyingMarks;
            this.courseId = courseId;
	        this.hostelRequired = hostelRequired;
	    }

	    public boolean validateMarks() {
        if (qualifyingMarks >= 65 && qualifyingMarks <= 100) {
	            return true;
	        } else {
	            System.out.println("Marks is less than 65. You are not eligible for admission!!");
	            return false;
	        }
	    }

	    public boolean validateCourseId() {

	   
	  	        if (courseId >= 1001 && courseId <= 1005) {
            return true;
	        } else {
	            System.out.println("Invalid Course Id. Please try again!!");
	            return false;
	        }
	    }

	    public double calculateCourseFee() {
	        if (qualifyingMarks >= 85) {
	            courseFee = baseFee * 0.85;
	        } else if (qualifyingMarks >= 70) {
	            courseFee = baseFee * 0.9;
	        } else if (qualifyingMarks >= 65) {
	            courseFee = baseFee * 0.95;
        }
	        return courseFee;
	    }

	    public void displayDetails() {
	        if (validateMarks() && validateCourseId()) {
	           
	            if (courseId == 1001) {
	                baseFee = 55000;
	            } else if (courseId == 1002) {
	                baseFee = 35675;
	            } else if (courseId == 1003) {
	                baseFee = 28300;
	            } else if (courseId == 1004) {
	                baseFee = 22350;
	            } else if (courseId == 1005) {
	                baseFee = 115000;
	            }
	            courseFee = calculateCourseFee();
	            System.out.println("********Course Allocation Details********");
	            System.out.println("Student Name : " + name);
	            System.out.println("Course Id : " + courseId);
	            System.out.println("Qualifying Exam Marks : " + qualifyingMarks);
	            System.out.println("Student's Registration Id : " + registrationId);
	            System.out.println("Total course fee : " + courseFee);
	            System.out.println("Hostel Required : " + (hostelRequired ? "Yes" : "No"));	        }
	    }}
