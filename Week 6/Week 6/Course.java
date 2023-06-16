public class Course {
  private int courseId, creditHours;
  private String courseName, courseCat;



  public void setCourseName (String courseName) {
    this.courseName = courseName;
  }

  public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public int getCreditHours() {
	return creditHours;
}

public void setCreditHours(int creditHours) {
	this.creditHours = creditHours;
}

public String getCourseCat() {
	return courseCat;
}

public void setCourseCat(String courseCat) {
	this.courseCat = courseCat;
}

public String getCourseName () {
    return courseName;
  }
}