public class Training {
    private String trainingId;
    private String courseName;
    private double duration;

    public Training(String trainingId, String courseName, double duration) {
        this.trainingId = trainingId;
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public String getCourseName() {
        return courseName;
    }

    public double getDuration() {
        return duration;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}
