package OOP.Polymorphism.exercise.word;

public class TextModifier {

    private StringBuilder text;
    private String cut;

    public TextModifier(StringBuilder text) {
        this.text = text;
    }

    public StringBuilder getText() {
        return text;
    }

    public void setText(StringBuilder text) {
        this.text = text;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }
}
