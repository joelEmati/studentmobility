public class Etudiant {
    private String Nom;
    private int Age;
  
    public Etudiant(String Nom, int Age)
    {
        this.Nom = Nom;
        this.Age = Age;
    }

    public void JeMePresente(Etudiant etudiant)
    {
        System.out.println("Je suis l'etudiante " + etudiant.getNom() + " " + etudiant.getAge() + " ans");
    }
    public void JePresenteMonParent(Etudiant etudiant)
    {
        System.out.println("Mon parent a "  + (etudiant.getAge() + 20) + " ans" );
    }

    //Getters
    public String getNom()
    {
        return Nom;
    }
    public float getAge()
    {
        return Age;
    }

    //Setters
    public void setNom(String Nom)
    {
        this.Nom = Nom;
    }
    public void setAge(int Age)
    {
        this.Age = Age;
    }
    

}
