package app;
public class Carte_Energie extends Carte {

    public Carte_Energie(String type, int numero, String extension){
        super(type, "Energie", numero, extension);
		this.type = type;
    }

    public String toString() {
        String text = super.toString();
        text += "Type: " + type +"\n";
        return text;
    }

    public void editCard(String toEdit, String content) {
        super.editCard(toEdit, content);
        if (toEdit == "type") {
            type = content;
        }
    }
}


