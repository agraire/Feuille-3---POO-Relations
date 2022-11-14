package exo32;

public class Cercle extends Forme{
  private double rayon;

  public Cercle(double rayon){
    this.rayon = rayon;
  }

  @Override
  public double getSurface(){
    return rayon * rayon * Math.PI;
  }
}