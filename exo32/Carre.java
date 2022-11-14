package exo32;

public class Carre extends Forme{
  private double cote;

  public Carre(double cote){
    this.cote = cote;
  }

  @Override
  public double getSurface(){
    return cote * cote;
  }
}