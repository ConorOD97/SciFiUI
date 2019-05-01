package ie.tudublin;

import processing.core.PApplet;
import ddf.minim.AudioInput;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import ddf.minim.*;


public class UI extends PApplet
{
    Minim minim;
    AudioPlayer aa;
    //UI class variables
    int mode = 0;

    //Class Objects
    RotateArcs arcs;
    MoveLine Mlines;
    Radar radar;
    Button b;
    Stars s;
    Controls c;
    Audio audio;
    Chart pie;
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
        Mlines = new MoveLine(50,100,750,50,500,100,2,2,this); //x,x2,x3,y,y2,y3,xspeed,yspeed,ui   line2 x,y3,x3,y3
        radar = new Radar(0,150,650,this);
        b = new Button(this,-250,100,50,100,200,75,200,75,"LAUNCH","EXIT");
        s = new Stars(this,0,0);
        c = new Controls(this);
        pie = new Chart(this);
        audio = new Audio(this);

        minim = new Minim(this);
        aa = minim.loadFile("aa.wav");
        
    }


    public void draw() {

        aa.play();
        background(0);

        if (mode == 0){
            arcs.RotatingCircle();
            arcs.RotatingCircle2();
            b.drawButton();
            b.Title();

            
            if (mousePressed){
                if(mouseX >= 150 && mouseX <= 350 && mouseY >= 500  && mouseY <=575){
                    mode++;
                }
                else if (mouseX >= 450 && mouseX <= 650 && mouseY >= 500  && mouseY <=575){
                    System.exit(0);
                }
            }
        } else if (mode == 1){
            background(0);
             
            c.Board();
            c.ChartContainer();
            c.Offbuttons();
            c.exitButton();
            radar.rotateLine();
            radar.radar();
            radar.Dot();
            pie.PieChart();
            
            if (mousePressed){
                if (mouseX >= 400 && mouseX <= 450 && mouseY >= 600  && mouseY <=650)
                {
                    mode++;
                }else if(mouseX >= 400 && mouseX <= 450 && mouseY >= 650  && mouseY <=700)
                {
                    mode++;
                    mode++;
                }else if (mouseX >= 400 && mouseX <= 500 && mouseY >= 550  && mouseY <600){
                    System.exit(0);
                }
            }
            
            
            // audio.settings();
            // audio.setup();
            // audio.render();
        } else if (mode == 2){
            background(0); 
            c.Board();
            c.ChartContainer();
            c.Onbutton1();
            c.exitButton();
            radar.rotateLine();
            radar.radar();
            radar.Dot();
            pie.PieChart();
            Mlines.updateLine();
            Mlines.updateLine2();
            Mlines.LineMove();
            if (mousePressed){
                if (mouseX >= 400 && mouseX <= 450 && mouseY >= 650  && mouseY <=700)
                {
                    mode++;
                }else if (mouseX >= 400 && mouseX <= 500 && mouseY >= 550  && mouseY <600){
                    System.exit(0);
                }
            }

        }  else if (mode == 3){
            background(0); 
            c.Board();
            c.ChartContainer();
            c.Onbutton2();
            c.exitButton();
            radar.rotateLine();
            radar.radar();
            radar.Dot();
            pie.PieChart();
            s.render();

            if (mousePressed){
                if (mouseX >= 400 && mouseX <= 450 && mouseY >= 600  && mouseY <=650)
                {
                    mode--;
                }else if (mouseX >= 400 && mouseX <= 500 && mouseY >= 550  && mouseY <600){
                    System.exit(0);
                }
            }
        }
       
    }
}
