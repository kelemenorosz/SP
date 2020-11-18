package com.company.services;

import com.company.models.Paragraph;
import com.company.models.Context;

public interface AlignStrategy {
    void render(Paragraph paragraph, Context context);
}
