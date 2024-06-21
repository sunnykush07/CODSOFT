import java.util.Scanner;

public class GradeCalci {
    
    public static char Grade(float percentage){
        if(percentage>90){
            return 'O';
        }
        else if(percentage>80){
            return 'A';
        }
        else if(percentage>70){
            return 'B';
        }
        else if(percentage>60){
            return 'C';
        }
        else if(percentage>50){
            return 'D';
        }
        else if(percentage>40){
            return 'E';
        }
        else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("[ ~ STUDENT GRADE CALCULATOR ~ ]");
        System.out.print("Enter Number of Subjects:- ");
        int subjects=sc.nextInt();

        int totalMarks=0;
        for(int i=1; i<=subjects; i++){
            System.out.println("Marks obtained in Subject_"+i);
            System.out.print("=> ");
            int mark=sc.nextInt();
            totalMarks += mark;
        }
        float percentage=(float)totalMarks/subjects;
        char grade=Grade(percentage);

        System.out.println("\nTotal Marks: "+totalMarks);
        System.out.println("Percentage: "+percentage+"%");
        System.out.println("Grade: "+grade);
        sc.close();
    }
}
