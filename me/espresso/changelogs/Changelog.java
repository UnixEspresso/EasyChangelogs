package me.espresso.changelogs;

import java.lang.reflect.Array;
import java.util.List;

public class Changelog {
    private String[] updates;
    private String title;

    public Changelog(String title, String[] content){
        this.updates = content;
        this.title = title;
    }

    public String[] getUpdates(){
        return updates;
    }

    public String title(){
        return title;
    }
}
