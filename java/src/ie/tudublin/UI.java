package ie.tudublin;

import processing.core.PApplet;

public class UI extends PApplet
{
    //UI class variables
    int mode = 0;

    //Class Objects
    RotateArcs arcs;
    MoveLine Mlines;
    Radar radar;
    Button b;
    Stars s;
    Controls c;
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
        Mlines = new MoveLine(0,0,800,0,800,400,2,2,this);
        radar = new Radar(0,150,650,this);
        b = new Button(this,-250,100,50,100,200,75,200,75,"LAUNCH","EXIT");
        s = new Stars(this,0,0);
        c = new Controls(this);
    }


    public void draw() {
        background(0);

        if (mode == 0){
            arcs.RotatingCircle();
            arcs.RotatingCircle2();
            b.drawButton();
            b.Title();

            
            if (mousePressed){
                if(mouseX >= 150 && mouseX <= 350 && mouseY >= 500  && mouseY <=575){
                    mode++;
                } else if (mouseX >= 450 && mouseX <= 650 && mouseY >= 500  && mouseY <=575){
                    System.exit(0);
                }
            }
        } else if (mode == 1){
            background(0);
             
            Mlines.updateLine();
            Mlines.updateLine2();
            Mlines.LineMove();
            s.render(); 
            
            c.Board(); 
            radar.rotateLine();
            radar.radar();
            radar.Dot();
        }  
        
        
        
    }
}
