package day16;

public class SwitchStatement2
{
    public static void main(String[] args) {
        String dayOfTheWeek = "Wednesday";

        switch (dayOfTheWeek)
        {
            case "Monday":
                System.out.println("Its Monday, I will demonstrate a project in Office today");
                break;
            case "Tuesday":
                System.out.println("Its Tuesday, I will write some app code today");
                break;
            case "Wednesday":
                System.out.println("Its Wednesday, I will debug some app code today");
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
