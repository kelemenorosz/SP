package ro.euvt.springtest.services;

import ro.euvt.springtest.models.Context;
import ro.euvt.springtest.models.Paragraph;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}
