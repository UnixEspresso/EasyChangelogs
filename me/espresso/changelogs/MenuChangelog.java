package me.espresso.changelogs;

import net.minecraft.client.gui.Gui;

import java.awt.*;
import java.util.ArrayList;

public class MenuChangelog {
    private final ArrayList<Changelog> changelogs = new ArrayList<>();
    private final int y;
    private final int x;
    private final CFontRenderer font = FontLoaders.Sans18;
    public MenuChangelog(final int x, final int y){
        this.x = x;
        this.y = y;

        this.changelogs.add(new Changelog("Espresso 3.20", new String[]{"+ Added visuals", "+ BlocksMC Recode Flight","+ More themes."}));
        this.changelogs.add(new Changelog("Espresso 3.19", new String[]{"+ Better visuals", "+ New Bypasses","+ Minor improvements and bug fixes."}));

    }

    public void draw(){
        int changeY = 0;
        Gui.drawRect(x,y,x+170, y+changelogs.size()*62, new Color(36,35,37).getRGB());
        for(Changelog c : changelogs){
            font.drawString(c.title(), x+10, y+10+changeY, new Color(153, 158, 255).getRGB());
            int set = 0;
            for(String s : c.getUpdates()){
                int before = y+14+changeY;
                set += 12;
                font.drawString(s,x+10, before+set,new Color(210,210,210).getRGB());
            }
            changeY += c.getUpdates().length*20;
        }
    }
}
