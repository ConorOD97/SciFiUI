package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    RotateArcs arcs;
    MoveLine Mlines;
    Radar radar;
    Button b;
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
        size(800, 800);
    }

    public void setup()
    {
        arcs = new RotateArcs(0,0,this,PI + PI/1.5f);
        Mlines = new MoveLine(0,0,500,0,500,250,2,2,this);
        radar = new Radar(0,this);
        b = new Button(this,-250,100,50,100,200,75,200,75,"LAUNCH","EXIT");
    }


    public void draw() {
        background(0);
        
        arcs.RotatingCircle();
        arcs.RotatingCircle2();
        b.drawButton();
        // Mlines.updateLine();
        // Mlines.updateLine2();
        // Mlines.LineMove();
        // radar.rotateLine();
        // radar.radar();
        // radar.Dot();
        
    }
}
