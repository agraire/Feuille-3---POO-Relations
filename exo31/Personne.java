package exo31;

public class Personne {
  protected String prenom;


  public Personne(String prenom){
    this.prenom = prenom;
  }

  public void afficher(){
    System.out.println("La personne s'appelle " + prenom);
  }

  //Falcutatif

  public String getNom(){
    return prenom;
  }
 }