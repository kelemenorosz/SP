package com.company;

import java.util.ArrayList;

public class Chapter {

    private String name;
    private ArrayList<SubChapter> subChapters = new ArrayList<SubChapter>();

    public Chapter(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + subChapters;
    }

    public int creteSubChapter(String subChapterName) {
        SubChapter tempSC = new SubChapter(subChapterName);
        subChapters.add(tempSC);
        return subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int indexSubChapterOneOne) {
        return subChapters.get(indexSubChapterOneOne);
    }
}
