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
	
Chart: 
# What I am most proud of in the assignment

# Markdown Tutorial

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

