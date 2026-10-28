import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

       
        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);

    
        Job job = new Job(70.0, 0, 2026);


        boolean isEligible = EligibilityChecker.checkEligibility(candidate, job);
    
        System.out.println("Candidate: " + candidate.getName());
        if (isEligible) {
            System.out.println("Status: Eligible for Placement");
        } else {
            System.out.println("Status: Not Eligible");
        }

        scanner.close();
    }
}