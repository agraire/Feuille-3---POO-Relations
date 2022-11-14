package exo2;

public class PointNom extends Point {
  public PointNom(int x, int y, String nom){
    setPointNom(x, y, nom);
  }
  
  private String nom;

  public void setPointNom(int x, int y, String nom){
    setPoint(x, y);
    setNom(nom);
  }

  public void setNom(String nom){
    this.nom = nom;
  }

  public void affCoordsNom(){
    afficheCoords();
    System.out.println("Nom = " + nom);
  }
  
}