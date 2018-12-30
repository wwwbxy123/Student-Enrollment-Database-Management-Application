package StudentDatabaseApp;

import java.util.Scanner;

public class Students {
    private String  firstName;
    private String lastName;
    private int gradYear;
    private String ID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCredits = 600;
    private static int id = 1001;

    /**  constructor: student enters names and school year */
    public Students(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = input.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = input.nextLine();

        System.out.println("1 - Freshman");
        System.out.println("2 - Sophmore");
        System.out.println("3 - Junior");
        System.out.println("4 - Senior");
        System.out.println("Enter your class level(1,2,3,4)");
        this.gradYear = input.nextInt();

        setStudentId();
        System.out.println(firstName + " " + lastName + " " + gradYear + " " + ID);


    }

    /** generate ID grade level + ID */
    private void setStudentId(){
       this.ID =  gradYear + "" + id;

    }


    /** enroll in courses */
    public void enroll(){
        do {
            System.out.println("Enter course you enrolled (Q to quit): ");
            Scanner input = new Scanner(System.in);
            String course = input.nextLine();

            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCredits;
            }
            else{
               // System.out.println("BREAK");
                break;
            }
        }while(1 != 0);

        System.out.println("Enrolled courses: " + courses);
        System.out.println("tuition balance: " + tuitionBalance);
    }




    /** pay tuition */
    public void payTuition(){
        viewBalanca();

        System.out.println("Enter your payment: $");
        Scanner input = new Scanner(System.in);
        int payment = input.nextInt();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalanca();
    }

    /** show status */

}
