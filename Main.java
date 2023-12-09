import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Etudiant etudiant = new Etudiant("Claudia",20);
        
        // etudiant.JeMePresente(etudiant);
        // etudiant.JePresenteMonParent(etudiant);

        try (Scanner lecture = new Scanner(System.in)) {
            System.out.print("Entrez votre nom: ");
            String nom = lecture.next();
            System.out.print("Entrez votre age: ");
            int age = lecture.nextInt();
           
            Etudiant etudiant2 = new Etudiant(nom, age);
            etudiant2.JeMePresente(etudiant2);
            etudiant2.JePresenteMonParent(etudiant2);
        }
            
        
        
    }
}
