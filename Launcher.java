package studentsInClassroom;

public class Launcher {

	public static void main(String[] args) {
		Classroom classroom = new Classroom();
		Students s = new Students();
		s.setName("Ivan");
		s.setSecondName("Ivanov");

		classroom.enter(s);
		classroom.printStudentInfo();
		classroom.isPresent("Ivan", "Ivanov");
		classroom.leave(s);
		classroom.printStudentInfo();
	}

}
