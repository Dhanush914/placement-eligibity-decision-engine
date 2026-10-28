public class EligibilityChecker {
    public static boolean checkEligibility(Candidate candidate, Job job) {
        if (candidate.getPercentage() >= job.getRequiredPercentage() &&
            candidate.getBacklogs() <= job.getAllowedBacklogs() &&
            candidate.getGraduationYear() == job.getRequiredGraduationYear()) {
            return true;
        }
        return false;
    }
}