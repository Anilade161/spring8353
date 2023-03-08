package springProject18353.basics;

public class ScienceTeacher implements Teaching{

	private String teacherName;
	
	public ScienceTeacher(String teacherName) {
		this.teacherName = teacherName;
		System.out.println("inside c onstr");
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
		System.out.println(" i came here..");
	}

	public void toteach() {
		System.out.println("i am going to teach scienec"+ teacherName);
		
	}
}
