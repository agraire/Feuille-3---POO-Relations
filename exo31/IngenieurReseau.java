package exo31;

public class IngenieurReseau extends Personne{

  public IngenieurReseau(String prenom){
    super(prenom);
  }

  public void afficher(){
    System.out.println("L'ingénieur réseau se nomme " + prenom);
  }
}