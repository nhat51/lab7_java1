package HomeWork.Marks;

import java.util.Scanner;

public class Marks {
    int[][] Marks;
    int Subject;
    String Name;
    public Marks(){
        Marks = new int[3][4];
        Subject = 0;
    }

    void enterMarks(){
        Scanner scan = new Scanner(System.in);
        if (Subject < Marks.length){
            System.out.println("Enter student name:");
            Name = scan.nextLine();

            System.out.println("Enter Mark of C:");
            Marks[Subject][0] = scan.nextInt();

            System.out.println("Enter Mark of Java:");
            Marks[Subject][1] = scan.nextInt();

            System.out.println("Enter Mark of HTML:");
            Marks[Subject][2] = scan.nextInt();

            System.out.println("Enter Mark of PHP:");
            Marks[Subject][3] = scan.nextInt();
            Subject++;
        }
        else
            System.out.println("Can't add more student");
    }
    void DisplayMark() {
        if (Subject > 0) {
            System.out.println("\nName \t\tC\t\tJava\t\tPHP \tHTML");
            System.out.println("---------------------------------------");
            for (int rowIndex = 0; rowIndex < Subject; rowIndex++) {
                System.out.print(Name);
                System.out.printf("\t\t%d\t\t", Marks[rowIndex][0]);
                System.out.printf("%d\t\t", Marks[rowIndex][1]);
                System.out.printf("%d\t\t", Marks[rowIndex][2]);
                System.out.printf("%d\t\t\n", Marks[rowIndex][3]);
            }
        }else
            System.out.println("No mark entered");
    }
    void searchMark(){
        boolean markFound = false;
        if (Subject > 0 && Subject < 5 ){
            Scanner insert = new Scanner(System.in);
            System.out.println("Enter id of subject(1.C,2.Java,3.PHP,4.HTML):");
            int searchMark = insert.nextInt();
            System.out.println("\nName \t\tC\t\tJava\t\tPHP \tHTML");
            System.out.println("---------------------------------------");
            for (int rowIndex = 0; rowIndex < Subject; rowIndex++) {
                if (Marks[rowIndex][0] == searchMark){
                    System.out.print(Name);
                    System.out.printf("\t\t%d\t\t", Marks[rowIndex][0]);
                    System.out.printf("%d\t\t", Marks[rowIndex][1]);
                    System.out.printf("%d\t\t", Marks[rowIndex][2]);
                    System.out.printf("%d\t\t\n", Marks[rowIndex][3]);
                    markFound = true;
                    break;
                }
            }
        }else
            System.out.println("Id doesn't match");
    }
}
