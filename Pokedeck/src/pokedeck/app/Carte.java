package app;

public abstract class Carte{
	
	private int numero;
    private String nom;
    private String type;
    private String extension;
    private String description;

    public Carte(int numero, String nom, String type, String extension) {
        this.numero = numero;
        this.nom = nom;
		this.type = type;
        this.extension = extension;
    }
	///////////////////////////////////////////////////////////////////////
	public int getNumero() {
        return numero;
    }
	public void setNumero(int numero) {
        this.numero = numero;
    }
	///////////////////////////////////////////////////////////////////////
    public String getNom() {
        return this.nom;
    }
	public void setNom(String nom) {
        this.nom = nom;
    }
	///////////////////////////////////////////////////////////////////////
    public String getType() {
        return type;
    }
	public void setType(String type) {
        this.type = type;
    }
	//////////////////////////////////////////////////////////////////////
    public String getExtension() {
        return extension;
    }
	public void setExtension(String extension) {
        this.extension = extension;
    }
	////////////////////////////////////////////////////////////////////// 
    public String getDescription() {
        return description;
    }
	public void setDescription(String description) {
        this.description = description;
    }
	
}