package app;
public class Carte_Pokemon extends Carte{

    private int pv;
    private String niveau;
    private String [] attaque;

    public Carte_Pokemon(String type, String nom, int numero, String extension, int pv, String niveau, String [] attaque){
        super(numero, type, nom, extension);
        this.pv = pv;
        this.niveau = niveau;
        this.attaque = attaque;
    }
	///////////////////////////////////////////////////////////////////////
    public int getPv() {
        return pv;
    }
	public void setPv(int pv) {
        this.pv = pv;
    }
	///////////////////////////////////////////////////////////////////////
    public String getNiveau() {
        return niveau;
    }
	public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
	///////////////////////////////////////////////////////////////////////
    public String[] getAttaque() {
        return attaque;
    }
    public void setAttaque(String[] attaque) {
        this.attaque = attaque;
    }
}

