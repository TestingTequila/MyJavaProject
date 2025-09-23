package day16;

public class SwitchStatement3
{
    public static void main(String[] args) {
        String dayOfTheWeek = "Saturday";

        switch (dayOfTheWeek)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
                System.out.println("Its Monday, I will demonstrate a project in Office today");
            case "Thursday":
                System.out.println("Its Thursday, I will train some trainees");
                break;
            case "Friday":
                System.out.println("Its Friday, I will set up some internal review meeting");
                break;
            default:
                System.out.println("Its weekend....will party...");
                break;
        }
    }

}
