package org.Api.get;

import java.util.List;

public class SlideShow {
    private String author;
    private String  date;
    private List<Slide> slides;
    private String title;


    public SlideShow(String author,String date,List<Slide> slide,
                     String title){
        this.author=author;
        this.date=date;
        this.slides =slide;
        this.title=title;

    }

    public String getTitle() {
        return title;
    }

    public List<Slide> getSlide() {
        return slides;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }
}
