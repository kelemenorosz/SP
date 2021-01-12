package ro.euvt.springtest.services;

import ro.euvt.springtest.models.Context;
import ro.euvt.springtest.models.Paragraph;

public class AlignRight implements AlignStrategy{
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Right" + paragraph.getText());
    }
}
