package OOP.Polymorphism.exercise.word.transformation;

import OOP.Polymorphism.exercise.word.TextModifier;
import OOP.Polymorphism.exercise.word.TextTransform;

public class Cut implements TextTransform {

    private String lastRemoved = "";

    @Override
    public void invokeOn(TextModifier text, int startIndex, int endIndex) {
        if (text.getText().toString().length() <= 0) {
            return;
        }

        if (startIndex == endIndex) {
            text.setCut("");
            return;
        }

        this.lastRemoved = "";

        for (int i = startIndex; i < endIndex; i++) {
            this.lastRemoved += text.getText().charAt(i);
        }

        text.getText().replace(startIndex, endIndex, "");
        text.setCut(lastRemoved);
    }
}
