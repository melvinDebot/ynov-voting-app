package poo;

public class TextBox {
    // Etat
    public String text;

    // Les actions sur l'objet
    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }
}