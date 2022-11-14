package exo3;


public class Voiture{
  private int vitesseMaximale;
  private double prixBase;
  private String couleur;

  public Voiture(int vitesseMaximale, double prixBase, String couleur){
    this.vitesseMaximale = vitesseMaximale;
    this.prixBase = prixBase;
    this.couleur = couleur;
  }

  public double calculerPrixDeVente(){
    return prixBase;
  }
}