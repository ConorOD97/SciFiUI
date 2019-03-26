package ie.tudublin;

import processing.core.PApplet;

public class Radar extends PApplet{
    
    float x,y = 0;
    float linex = 250; float linex1 = 250; float linex2 = 200; float linex3 = 300;
    float liney = 200; float liney1 = 300; float liney2 = 250; float liney3 = 250;
    float lx = 0; float lx1 = 50; //lx ly = line x and line y
    float ly = 0; float ly1 = 0;
    float cw1 = 20; float cw2 = 40; float cw3 = 60; float cw4 = 80; float cw5 = 100; //cw = circle width
    float ch1 = 20; float ch2 = 40; float ch3 = 60; float ch4 = 80; float ch5 = 100; //ch = circle height
    float r;
    PApplet ui;

    public void settings(){
        size(500,500);
    }

    public void setup(){

    }

    public Radar(float x, float y, float linex, float linex1, float linex2, float linex3, float liney, float liney1,
    float liney2, float liney3, float lx, float lx1, float ly, float ly1, float cw1, float cw2, float cw3,
    float cw4, float cw5, float ch1, float ch2, float ch3, float ch4, float ch5, float r, PApplet ui)
    {
        this.x = x; this.y =y;
        this.linex = linex; this.linex1 = linex1; this.linex2 = linex2; this.linex3 = linex3;
        this.liney = liney; this.liney1 = liney1; this.liney2 = liney2; this.liney3 = liney3;
        this.lx = lx; this.lx1 = lx1;
        this.ly = ly; this.ly1 = ly1;
        this.cw1 = cw1; this.cw2 = cw2; this.cw3 = cw3; this.cw4 = cw4; this.cw5 = cw5;
        this.ch1 = ch1; this.ch2 = ch2; this.ch3 = ch3; this.ch4 = ch4; this.ch5 = ch5;  
        this.r = r;
        this.ui = ui;
    }
    public void radar(){
        
        ui.line(linex,liney,linex1,liney1);
        ui.line(linex2,liney2,linex3,liney3);
        ui.translate(ui.width/2,ui.height/2);
        ui.ellipse(x,y,cw1,ch1);
        ui.ellipse(x,y,cw2,ch2);
        ui.ellipse(x,y,cw3,ch3);
        ui.ellipse(x,y,cw4,ch4);
        ui.ellipse(x,y,cw5,ch5);
        
    }

    public void rotateLine(){
        ui.pushMatrix();

        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r));
        ui.line(lx,ly,lx1,ly1);

        ui.popMatrix();
        
        r -= 0.55;
        
    }

}