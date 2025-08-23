package labsession;

public class caseswitch {

	public static void printDay(int dayNumber) {
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = null;
                System.out.println("Error: day number must be between 1 and 7.");
                return;
        }
        System.out.println("Day " + dayNumber + " is " + dayName + ".");
    }

    public static void main(String[] args) {
        printDay(1);  
        printDay(2);
        printDay(3);
        printDay(4);
        printDay(5);  
        printDay(6);
        printDay(7); 
        printDay(0);  
    }
}