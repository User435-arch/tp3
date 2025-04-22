//<<<<<<< HEAD
public class Cryptomonnaie
{
    private String nom;
    private double valeurDeJeton; // Imaginons en euros

    public Cryptomonnaie(String nom, double valeurDeJeton)
    {
        this.nom = nom;
        this.valeurDeJeton = valeurDeJeton;
    }
	
	public String getNom() 
	{
        return nom;
    }

    public double getValeurDeJeton()  {return this.valeurDeJeton;}



    public String toString() {
        return String.format("%5s",nom) + ":" + String.format("%10.1f",valeurDeJeton);
    }
}
//>>>>>>> 8b6bb780adac714bd2832444d7e87b5331a73bb8
