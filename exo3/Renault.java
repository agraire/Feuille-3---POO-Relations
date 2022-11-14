package exo3;

public class Renault extends Voiture {
  private int anneeFabrication;
  private double reductionConstructeur;

  public Renault(int vitesseMaximale, double prixBase, String couleur, int anneeFabrication, double reductionConstructeur){
    super(vitesseMaximale, prixBase, couleur);
    this.anneeFabrication = anneeFabrication;
    this.reductionConstructeur = reductionConstructeur;
  }
}