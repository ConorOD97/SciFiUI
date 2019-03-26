package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    RotateArcs arcs;
    MoveLine Mlines;
    Radar radar;
    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(500, 500);
        // Use fullscreen instead of size to make your interface fullscreen
        //fullScreen(P3D); 
    }

    public void setup()
    {
        arcs = new RotateArcs(0,0,0,0,2,2,450,350,this,PI + PI/1.5f);
        Mlines = new MoveLine(0,0,500,0,500,250,2,2,this);
        radar = new Radar(0,0,250,250,200,300,200,300,250,250,0,50,0,0,20,40,60,80,100,20,40,60,80,100,0,this);
    }


    public void draw()
    {
        background(0);
        stroke(255);
        noFill();
        arcs.RotatingCircle();
        arcs.RotatingCircle2();
        Mlines.updateLine();
        Mlines.updateLine2();
        Mlines.LineMove();
        radar.rotateLine();
        radar.radar();
        
        
    }
}
