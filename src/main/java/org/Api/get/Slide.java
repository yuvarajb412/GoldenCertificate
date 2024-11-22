package org.Api.get;

import java.util.List;

public class Slide {


    private String title;
    private String type;
    private List<String> items;

    public Slide(String title,String type, List<String> items){
        this.title=title;
        this.type =type;
        this.items = items;
    }


    public List<String> getItems() {
        return items;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}
