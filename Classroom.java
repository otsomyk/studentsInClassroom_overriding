package studentsInClassroom;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
	private List<Students> students;

	public Classroom() {
		students = new ArrayList<>();
	}

	public void enter(Students s) {
		students.add(s);
	}

	public void leave(Students s) {
		students.remove(s);
	}

	public int getStudentCount() {
		return students.size();
	}

	public void isPresent(String name, String secondName) {
		 Students s = new Students();
	        s.setName(name);
	        s.setSecondName(secondName);

	        for (int i = 0; i < students.size(); i++){
	            if ( students.get(i).equals(s)){
	                System.out.println(name + " " + secondName + " is in the classroom now");
	            } else {
	                System.out.println(name + " " + secondName + " is absent today");
	            }
	        }
	}

	public void printStudentInfo() {
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getName() + " "
					+ students.get(i).getSecondName());
		}
	}

	public List<Students> getStudents() {
		return new ArrayList<>(students);
	}

}
