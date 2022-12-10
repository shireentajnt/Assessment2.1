//Student class
public class Student {
    private String studentId;
    private String studentName;
    private Training training;
    private String grade;

    public String getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public Training getTraining() {
        return training;
    }

    public String getGrade() {
        return grade;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setTraining(Training training) {
        this.training = training;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
