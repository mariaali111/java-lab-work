package problem02;

public class Faculty extends University{
    private String facultyName;

    Faculty(String uniName, int ranking, String facultyName) {
        super(uniName, ranking);
        this.facultyName = facultyName;
    }

    public String getFacultyName() { return facultyName; }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }
    void Details() {
        System.out.println("Faculty Name: " + facultyName);
    }
}
