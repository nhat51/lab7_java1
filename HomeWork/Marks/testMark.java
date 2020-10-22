package HomeWork.Marks;

import java.util.Scanner;

public class testMark {
    public static void main(String[] args) {
        Marks m1 = new Marks();
        int choice;
        Scanner input = new Scanner(System.in);
        do {
           System.out.println("What do you want");
           System.out.println("1.Add student and mark");
           System.out.println("2.Search mark of subject");
           System.out.println("3.Display mark of student");
           choice = input.nextInt();
           switch (choice){
               case 1:
                   m1.enterMarks();
                   break;
               case 2:
                   m1.searchMark();
                   break;
               case 3:
                   m1.DisplayMark();
                   break;
               default:
                   System.out.println("invalid choice");
                   break;
           }
        }while (choice != 4);
    }
}
