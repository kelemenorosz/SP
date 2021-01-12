package ro.euvt.springtest.services;

import ro.euvt.springtest.models.Context;
import ro.euvt.springtest.models.Paragraph;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Center" + paragraph.getText());
    }
}
