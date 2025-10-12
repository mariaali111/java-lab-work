package problem06;

public class Department extends Faculty{
    private String deptName;
    private String chairman;

    Department(String uniName, int ranking, String facultyName, String deptName, String chairman) {
        super(uniName, ranking, facultyName);
        this.deptName = deptName;
        this.chairman = chairman;
    }
    public String getDeptName() { return deptName; }
    public void setDeptName(String deptName) { this.deptName = deptName; }

    public String getChairman() { return chairman; }
    public void setChairman(String chairman) { this.chairman = chairman; }

    void Details() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Chairman: " + chairman);
    }
    void Display() {
        System.out.println("University Name: " + getName());
        super.Details();
        this.Details();
        System.out.println("University Ranking: " + getRanking());
    }
}
