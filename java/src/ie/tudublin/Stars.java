package ie.tudublin;

import processing.core.*;

public class Stars{
//decraling variables
    PApplet ui;
    float x;
    float y;
//constructor method
    public Stars(PApplet ui,float x, float y){
        this.ui = ui;
        this.x = x;
        this.y = y;
    }

    //draws stars
    public void render(){
        ui.fill(255);
        ui.ellipse(x = ui.random(100,ui.width-100),y = ui.random(100,ui.height-300),10,10); //generates ellipses at random x and y coords within a range
        
    }    
}
