import AssignmentThree.StartBike;

public class Main {
    // assignments available for his exam is: 3, 4, 5, 6, 7, 8, 10, and 11.
    public static void main(String[] args) {
        System.out.println("start of exam assignments");
        System.out.println("which assignment would you like to run?");
        int startAssignment = 3;
        switch (startAssignment){
            case 3:
                /*
                input: (current gear, max gear, bolts tightened, pedals working, tyre pressure,
                size of tyres, colour of head lights, colour of rear lights )

                */
                System.out.println("Starting assignment 3");

                StartBike startBike = new StartBike(2, 5, true, true, 2.5F, 30, "blue", "red");
                break;

            case 4:
                /*
                */
                System.out.println("Starting assignment 4");
                break;

            case 5:
                /*
                 */
                System.out.println("Starting assignment 5");
                break;

            case 6:
                /*
                 */
                System.out.println("Starting assignment 6");
                break;

            case 7:
                /*
                 */
                System.out.println("Starting assignment 7");
                break;

            case 8:
                /*
                 */
                System.out.println("Starting assignment 8");
                break;

            case 10:
                /*
                 */
                System.out.println("Starting assignment 10");
                break;

            case 11:
                /*
                 */
                System.out.println("Starting assignment 11");
                break;

        }
    }
}