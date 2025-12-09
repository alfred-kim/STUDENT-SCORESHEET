
import java.util.Scanner;
public class marksheet {
    public static void main(String args []){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the school:");
        String School_name = scanner.nextLine();

        System.out.println("Enter the name of the teacher:");
        String Teacher_name = scanner.nextLine();
        System.out.println("Enter the grade:");
        int grade = scanner.nextInt();


        System.out.println("Enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Key in the number of students: ");
        int students_no =scanner.nextInt();
        scanner.nextLine();



        // FIXED SUBJECT NAMES
        String[] subjects = {"English", "Math", "History", "Geography", "Science", "Programming"};
        int subjects_no = subjects.length;

        String[] students = new String[students_no];
        double[][] marks = new double[students_no][subjects_no];

        for(int index=0; index<students_no; index++){
            System.out.println("Enter the student name:");
            students[index] = scanner.nextLine();
        }

        for (int index=0;index < students_no; index++){
            System.out.println("\nEnter marks for " + students[index] + ":");

            for (int j=0; j<subjects_no; j++){
                System.out.println("Subject " +(j+1) + ":");
                marks[index][j] = scanner.nextDouble();
            }
//            scanner.nextLine();
        }
        double[] totals = new double[students_no];
        String[] grades = new String[students_no];

        for(int index=0; index<students_no;index++){
            double sum = 0;
            for (int j=0;j<subjects_no;j++){
                sum+= marks[index][j];
            }
            totals[index] = sum;

            if (sum >=540) grades[index] = "A";
            else if (sum>= 480) grades[index] = "B";
            else if (sum >= 420) grades[index] = "C";
            else if (sum >= 360) grades[index] = "D";
            else grades[index] = "F";

        }
        double[] subjectTotals = new double[subjects_no];
        double[] subjectAverages = new double[subjects_no];

        for (int j=0;j<subjects_no;j++){
            double sum = 0;
            for(int index = 0; index<students_no; index++){
                sum +=marks[index][j];
            }
            subjectTotals[j] = sum;
            subjectAverages[j] = sum / students_no;
        }
        int countA = 0, countB = 0, countC = 0, countD = 0 ,countE=0 , countF=0;

        for(int index= 0; index<students_no; index++){
            switch (grades[index]){
                case "A": countA++; break;
                case "B": countB++; break;
                case "C": countC++; break;
                case "D": countD++; break;
                case "E" : countE++;break ;
                case "F": countF++; break;
            }
        }

        double grandTotal = 0;
        for(int index = 0; index<students_no; index++){
            grandTotal += totals[index];
        }
//        for(double t : totals){
//            grandTotal += t;
//        }
        System.out.println("\n==========================================================================================================================================================");
        System.out.printf("%71s\n","School Name: " + School_name);
        System.out.printf("%60s\n","Teacher: "+ Teacher_name);
        System.out.printf("%47s\n","Grade:" + grade);
        System.out.printf("%50s\n","Year:" + year);
        System.out.println("\n=========================================================================================================================================================");

        System.out.printf("%-24s","Student Name");
        for(String subject: subjects){
            System.out.printf("%12s", subject);
        }
        System.out.printf("%12s%8s\n", "Total", "Rank");
        System.out.println("\n=========================================================================================================================================================");

        for(int index=0; index<students_no; index++){
            System.out.printf( "%-24s", students[index]);
            for(int j=0; j<subjects_no; j++){
                System.out.printf("%12.2f", marks[index][j]);
            }
            System.out.printf("%12.2f%8s\n", totals[index], grades[index]);
//            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");


        System.out.printf("%-24s", "");
        for(int j=0; j<subjects_no; j++) {
            System.out.printf("%12.2f", subjectTotals[j]);
        }
        System.out.printf("%12.2f\n", grandTotal);
//            System.out.println();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-24s", "");
        for(int j=0; j<subjects_no; j++){
            System.out.printf("%12.2f",subjectAverages[j]);
        }
        System.out.printf("%12.2f\n",grandTotal/students_no);
//        System.out.println();
        System.out.println("\n=========================================================================================================================================================");

        System.out.printf("%32sRanks  A's: %d   B's: %d   C's: %d   D's: %d   F's: %d\n","",countA,countB,countC,countD,countF );
    }
}
