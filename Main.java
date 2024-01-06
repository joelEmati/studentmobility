import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner lecture = new Scanner(System.in);
        System.out.println("Bonjour quel est votre nom:");
        String Nom = lecture.nextLine();
        System.out.println("votre age svp:");
        int Age = lecture.nextInt();
        
        Student etudiant = new Student(Nom, Age);
        
        etudiant.JeMePresente(etudiant);
        etudiant.JePresenteMonParent(etudiant);
        
    }
}
