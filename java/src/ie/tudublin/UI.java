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
    //giving object names for each of the classes
    RotateArcs arcs;
    MoveLine Mlines;
    Radar radar;
    Button b;
    Stars s;
    Controls c;
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
    
    //sets screen size 
    public void settings()
    {
        size(800, 800);
    }

    //gives the variables specified in all the classes values
    public void setup()
    {
        arcs = new RotateArcs(0,0,this,PI + PI/1.5f);
        Mlines = new MoveLine(50,100,750,50,500,100,2,2,this); //x,x2,x3,y,y2,y3,xspeed,yspeed,ui   line2 x,y3,x3,y3
        radar = new Radar(0,150,650,this);
        b = new Button(this,-250,100,50,100,200,75,200,75,"LAUNCH","EXIT");
        s = new Stars(this,0,0);
        c = new Controls(this);
        pie = new Chart(this);
        minim = new Minim(this);
        aa = minim.loadFile("aa.wav");
        
    }

    //method which calls all other methods from inhertied classes
    public void draw() {

        aa.play();
        background(0);

        //mode is set to 0
        //calls starting methods the main page of program
        if (mode == 0){
            arcs.RotatingCircle();
            arcs.RotatingCircle2();
            b.drawButton();
            b.Title();

            // checks if cursor is between the coords of the button
            if (mousePressed){
                if(mouseX >= 150 && mouseX <= 350 && mouseY >= 500  && mouseY <=575){   //Launch Button 
                    mode++;                                                             // increments mode so that program will move onto next page
                }
                else if (mouseX >= 450 && mouseX <= 650 && mouseY >= 500  && mouseY <=575){   // Exit button on home screen
                    System.exit(0); //exits the program
                }
            }
        } else if (mode == 1){
            background(0);          //sets the background color to black in order to redraw everything over it
             
            //calling the methods neccessary for the control panel inteface
            c.Board();                          
            c.ChartContainer();
            c.Offbuttons();
            c.exitButton();
            radar.rotateLine();
            radar.radar();
            radar.Dot();
            pie.PieChart();
            
            if (mousePressed){
                if (mouseX >= 400 && mouseX <= 450 && mouseY >= 600  && mouseY <=650)  //Targeting system button
                {
                    mode++;                                                                 //increments mode to flick button on
                }else if(mouseX >= 400 && mouseX <= 450 && mouseY >= 650  && mouseY <=700) //star gazing button
                {
                    mode++;
                    mode++;                                                      //increments mode so that it runs the neccesary if statement
                                                                                 // to turn on this button and turn off the targeting system button
                }else if (mouseX >= 400 && mouseX <= 500 && mouseY >= 550  && mouseY <600){  // exit button
                    System.exit(0);  //exits program
                }
            }
            //if statement to turn on button 1
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
                if (mouseX >= 400 && mouseX <= 450 && mouseY >= 650  && mouseY <=700) // star gazing button
                {
                    mode++;
                }else if (mouseX >= 400 && mouseX <= 500 && mouseY >= 550  && mouseY <600){ // exit button
                    System.exit(0);
                }
            }
            //if statement to turn on star gazing button and turn off targeting button
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
                if (mouseX >= 400 && mouseX <= 450 && mouseY >= 600  && mouseY <=650) //targeting button
                {
                    mode--;                                             //subtracts 1 from mode in order to turn off stargazing button and turn
                                                                        // on the targeting system button
                }else if (mouseX >= 400 && mouseX <= 500 && mouseY >= 550  && mouseY <600){  //exit button
                    System.exit(0);
                }
            }
        }
       
    }
}
