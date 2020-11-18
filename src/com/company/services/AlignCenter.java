package com.company.services;

import com.company.models.Paragraph;
import com.company.models.Context;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        System.out.println("Align Center" + paragraph.getText());
    }
}
