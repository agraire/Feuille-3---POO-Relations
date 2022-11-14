package exo31;

public class IngenieurLogiciel extends Personne{

  public IngenieurLogiciel(String prenom){
    super(prenom);
  }

  public void afficher(){
    System.out.println("L'ingénieur logiciel se nomme " + prenom);
  }
}