public class EligibilityChecker {
    public static boolean checkEligibility(Candidate candidate, Job job) {
        if (candidate.getPercentage() >= job.getMinimumPercentage() &&
            candidate.getBacklogs() <= job.getMaximumBacklogs() &&
            candidate.getGraduationYear() == job.getRequiredGraduationYear()) {
            return true;
        }
        return false;
    }
}