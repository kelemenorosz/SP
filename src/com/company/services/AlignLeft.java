package com.company.services;

import com.company.models.Paragraph;
import com.company.models.Context;

public class AlignLeft implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Left" + paragraph.getText());
    }
}
