public class Personne
{
protected String nom;
protected String prenom;
protected int age;
public Personne(String n, String p, int a)
{ this.nom = n;
this.prenom = p;
this.age = a;
}
public void afficher()
{
System.out.println("Nom :"+nom+" prenom : "+prenom+" age : "+age);
}
}
