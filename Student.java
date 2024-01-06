 public class  Student{
    private String Nom;
    private int Age;
  
    public Student(String Nom, int Age)
    {
        this.Nom = Nom;
        this.Age = Age;
    }

    public void JeMePresente(Student student)
    {
        System.out.println("Je suis l'etudiant " + student.getNom() + " " + student.getAge() + " ans");
    }
    public void JePresenteMonParent(Student student)
    {
        System.out.println("Mon parent a "  + (student.getAge() + 20) + " ans" );
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
