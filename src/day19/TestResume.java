package day19;

public class TestResume
{
    public static void main(String[] args) {

        Resume johnResume= new Resume();
        johnResume.fName = "John";
        johnResume.lName = "Wolmer";
        johnResume.gender = 'm';
        johnResume.totalExperience =7;

        System.out.println(johnResume.fName);
        System.out.println(johnResume.lName);
        System.out.println(johnResume.gender);
        System.out.println(johnResume.totalExperience);

        System.out.println("================================================");

        Resume kerrieResume= new Resume();
        kerrieResume.fName = "Kerrie";
        kerrieResume.lName = "Wright";
        kerrieResume.gender = 'f';
        kerrieResume.totalExperience =10;

        System.out.println("===============================================");
        Resume benResume= new Resume();
        benResume.fName = "Ben";
        benResume.lName = "Fletcher";
        benResume.totalExperience = 3;
        benResume.gender ='m';

    }
}
