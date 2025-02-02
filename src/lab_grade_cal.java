
import java.util.Scanner;
public class lab_grade_cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your score");
        int score = sc.nextInt();
        char grade = 'F';
        if (score >=90 && score <=100){
            grade = 'A';
        }
            else if (score >=80 && score <=89){
                grade ='B';
            }
            else if (score >=70 && score <=79){
                    grade  = 'C';
            }
                 else if (score >=60 && score <=69){
                    grade  = 'D';
            } 
                 else if (score >=0 && score <=59){
                    grade  = 'F';
            }
            
            else if (score <=0 || score >100){
                 grade = 'O';
            System.out.println("invalid input");
        }

            System.out.println("Your grade is " +grade);


    }}

