# SciFi UI Project

Name: Conor O'Donnell

Student Number: C17441552

Fork this repository and use it a starter project for your assignment

# Description of the assignment
This assignment was about creating a science fiction inteface using the java processing library. This assignment helped me to brush up on my java skills and my github skills that I have learned throughout the year. It also helped me further develop my knowledge in the java language. I had watched some science fiction movies and tv shows in the past so I had a fairly good idea of what I wanted my interface to look like when starting the assignment.
# Instructions
When you run the program The main page pops up with two buttons you can click on. You then decide wether you want to launch or exit the program. When you launch the program you head into the spacecrafts control panel. The control panel has a radar and a chart along with two buttons. One of the buttons shows a targeting system and the other button shows the stars outside the spacecraft.

# How it works
When creating my assignment idea I made nine classes.

Main: Used to execute the UI class.

UI class: In this class I initialised and declared some objects. I passed in parameter variables that were needed for other classes.
This class loads in a sound file(aa.wav) and also uses some if statements and the (mousePressed) function in order to click on different buttons.

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
                }
            }

        }  else if (mode == 3){
            background(0); 
            c.Board();
            c.ChartContainer();
            c.Onbutton2();
            radar.rotateLine();
            radar.radar();
            radar.Dot();
            pie.PieChart();
            s.render();

            if (mousePressed){
                if (mouseX >= 400 && mouseX <= 450 && mouseY >= 600  && mouseY <=650)
                {
                    mode--;
                }
            }
        }
	
Button: This class declares some variables which are needed for the dimensions to draw the two buttons on the main page.
These are the launch and exit buttons. This class also has a welcome message to the program.

	public void Title(){
        ui.stroke(252,231,70);
        ui.textSize(25);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("WELCOME ABOARD",400,200);
        ui.line(250,225,550,225);
    }
    public void drawButton(){
        ui.pushMatrix();
            ui.stroke(3,255,221);
            ui.translate(ui.width/2,ui.height/2);
            ui.rect(-250,100,200,75);
            ui.rect(50,100,200,75);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.text(txt1,x + w * 0.5f, y + h * 0.5f);
            ui.text(txt2,x1 + w1 * 0.5f, y1 + h1 * 0.5f);
        ui.popMatrix();
    }
	
Chart: Uses a rainfall array and displays a piechart based on the rainfaill value. Also uses the map function

	void PieChart()
    {
        float cx = 275;
        float cy = 650;

        float w = ui.width * 0.1f;
        //arc(cx, cy, w, w, 0, TWO_PI, ARC);

        float total = 0;
            for (int i = 0 ; i < rainFall.length ; i ++)
            {
                total += rainFall[i];
            }

            float runningSum = 0;
            for (int i = 0 ; i < rainFall.length ; i ++)
            {
                float next = runningSum + rainFall[i];
                float start = ui.map(runningSum, 0, total, 0, ui.TWO_PI);
                float end = ui.map(next, 0, total, 0, ui.TWO_PI);
                ui.fill(ui.map(i, 0, rainFall.length, 150, 255), 0, 255);
                ui.arc(cx, cy, w, w, start, end, ui.ARC);
                runningSum = next;
            }
        
    }
    
Controls: The class created the control panel of the spacecraft. It also creates the buttons for the targeting system and star viewing.

	public void Board(){

            ui.background(200);
            ui.stroke (3,255,230);
            ui.fill(0);
            ui.rect(50,50,700,450,15);
            ui.fill(87,89,89);
            ui.rect(50,525,700,200,10);
            ui.fill(0);
            ui.rect(95,595,110,110);
    }

    public void Onbutton1(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(0,255,0);
        ui.rect(400,600,50,50);
        ui.fill(255,0,0);
        ui.rect(400,650,50,50);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(ui.CENTER);
        ui.text("Targeting System",560,635);
        ui.text("Stars",560,680);
    }

    public void Onbutton2(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(255,0,0);
        ui.rect(400,600,50,50);
        ui.fill(0,255,0);
        ui.rect(400,650,50,50);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(ui.CENTER);
        ui.text("Targeting System",560,635);
        ui.text("Stars",560,680);
    }

    public void Offbuttons(){
        ui.fill(0);
        ui.rect(400,600,250,50);
        ui.fill(0);
        ui.rect(400,650,250,50);
        ui.fill(255,0,0);
        ui.rect(400,600,50,50);
        ui.fill(255,0,0);
        ui.rect(400,650,50,50);
        ui.fill(255);
        ui.textSize(20);
        ui.textAlign(ui.CENTER);
        ui.text("Targeting System",560,635);
        ui.text("Stars",560,680);
    }

    public void ChartContainer(){
        ui.fill(0);
        ui.rect(225,600,100,100);
    }
    
MoveLine: This class draws two lines and uses two update functions to move the lines up and down the screen.

	public void LineMove(){
        ui.stroke(255);
        ui.line(x2,y,x2,y2);
        ui.line(x,y3,x3,y3);
    }

    public void updateLine(){
        x2 += xspeed;

        if (x2 > ui.width - 100 || x2 < 100){
            xspeed *= -1;
        }    
    }
    public void updateLine2(){
         y3 += yspeed;

         if(y3 > ui.height - 350 || y3 < 100){
             yspeed *= -1;
         }
    }
    
Radar: This class draws out a radar and uses the rotate() function to rotate the line on the radar.

	public void radar(){
        ui.stroke(37,255,3);
        ui.noFill();
        ui.ellipse(tx,ty,110,110);
        ui.stroke(53,128,41);
        ui.noFill();
        ui.pushMatrix();
            ui.translate(tx,ty);
            ui.line(0,-50,0,50);
            ui.line(-50,0,50,0);
            ui.ellipse(0,0,20,20);
            ui.ellipse(0,0,40,40);
            ui.ellipse(0,0,60,60);
            ui.ellipse(0,0,80,80);
            ui.ellipse(0,0,100,100);
        ui.popMatrix();
        
    }

    public void rotateLine(){
        ui.stroke(53,128,41);
        ui.pushMatrix();

        ui.translate(tx,ty);
        ui.rotate(ui.radians(r));
        ui.line(0,0,50,0);

        ui.popMatrix();
        
        r += 0.55;
        
    }

    public void Dot(){
        ui.noStroke();
        ui.pushMatrix();
            ui.translate(tx,ty);
            ui.fill(255,0,0);
            ui.ellipse(30,30,10,10); // x,y,width,hiehgt
        ui.popMatrix();

    }
    
RotatingArcs: This class creates two large arcs which are to be called on the main page. It rotates one arc clockwise and one arc anti clockwise giving a nice effect on the main page.

	public void RotatingCircle(){
	    ui.pushMatrix();
	    ui.noFill();
	    ui.stroke(174,255,0);
		ui.translate(ui.width/2,ui.height/2);
		ui.rotate(ui.radians(r));
		ui.arc(0,0,750,750,0,fullArc);
        
    ui.popMatrix();
    r += 0.55;
}


public void RotatingCircle2(){
    
    ui.pushMatrix();
        ui.translate(ui.width/2,ui.height/2);
        ui.rotate(ui.radians(r2));
        ui.arc(0,0,700, 700, 0, fullArc);
        
    ui.popMatrix();
    r2 -= 0.5;
}

Stars: This class draws ellipses at random x and y coordinates within a certain range. This creates a nice star gazing effect.

	public void render(){
        ui.fill(255);
        ui.ellipse(x = ui.random(100,ui.width-100),y = ui.random(100,ui.height-300),10,10);
        
    }    
# What I am most proud of in the assignment

# Markdown Tutorial
# Interactive (Buttons)

Launch: Launches the spacecraft and goes into its control room
Tageting System: Turns on the Targeting System
stars: Turns on star gazing mode
Exit: Exits the program








This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

