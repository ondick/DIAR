import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
     List<PersonalTask> osobniUkoly = new ArrayList<>();
     List<WorkTask> pracovniUkoly = new ArrayList<>();
     List<StudyTask> studijniUkoly = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     while (true) {
         System.out.println("MENU");
         System.out.println("1 (nový úkol)");
         System.out.println("2 (smazání úkolu)");
         System.out.println("3 (update úkolů)");
     }
     int cislo = sc.nextInt();
     switch (cislo) {
         case 1:
             System.out.println("Napiš nový úkol: ");
             break;
         case 2:
             System.out.println("Napiš jaký úkol chceš smazat: ");

             break;
         case 3:
             System.out.println("Napiš jaký úkol chceš updatenout: ");
             break;

     }
    }
}