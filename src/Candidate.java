public class Candidate {
    private String name;
    private double percentage;
    private int backlogs;
    private int graduationYear;
    private String[] candidateSkills;

    public Candidate(String name, double percentage, int backlogs, int graduationYear, String[] candidateSkills) {
        this.name = name;
        this.percentage = percentage;
        this.backlogs = backlogs;
        this.graduationYear = graduationYear;
        this.candidateSkills = candidateSkills;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    public int getBacklogs() {
        return backlogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public String[] getCandidateSkills() {
        return candidateSkills;
    }

    public boolean hasSkill(String skill) {
        for (String candSkill : candidateSkills) {
            if (candSkill.equalsIgnoreCase(skill)) {
                return true;
            }
        }
        return false;
    }
}