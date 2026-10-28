public class Job {
    private double requiredPercentage;
    private int allowedBacklogs;
    private int requiredGraduationYear;

    public Job(double requiredPercentage, int allowedBacklogs, int requiredGraduationYear) {
        this.requiredPercentage = requiredPercentage;
        this.allowedBacklogs = allowedBacklogs;
        this.requiredGraduationYear = requiredGraduationYear;
    }

    public double getRequiredPercentage() {
        return requiredPercentage;
    }

    public int getAllowedBacklogs() {
        return allowedBacklogs;
    }

    public int getRequiredGraduationYear() {
        return requiredGraduationYear;
    }
}