package studentsInClassroom;

public class Students {

	private String name;
	private String secondName;

	public Students() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Override
    public String toString() {
        return this.getName() + " " + this.getSecondName();
    }

    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Students){
            Students s = (Students) obj;
            if( name != null && name == s.getName()
                    && secondName != null && secondName == s.getSecondName()){
                return true;
            }
        }
        return false;
    }

}
