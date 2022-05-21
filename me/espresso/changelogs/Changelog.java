package me.espresso.changelogs;

public class Changelog {
    private final String[] updates;
    private final String title;

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

