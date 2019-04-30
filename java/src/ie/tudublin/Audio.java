package ie.tudublin;

import ddf.minim.AudioInput;
import ddf.minim.Minim;
import ddf.minim.analysis.FFT;
import processing.core.PApplet;

public class Audio{
    
    AudioInput ai;
    FFT fft;
    Minim minim;
    public static final int FRAME_SIZE = 1024;
    public static final int SAMPLE_RATE = 44100;
    public static final int BITS_PER_SAMPLE = 16;
    PApplet ui;

    public void settings()
    {
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO, FRAME_SIZE, SAMPLE_RATE, BITS_PER_SAMPLE);
        fft = new FFT(FRAME_SIZE, SAMPLE_RATE);
    }

    public void setup()
    {
        ui.colorMode(ui.HSB);
    }

    public Audio(PApplet ui)
    {
        this.ui = ui;
    }

    public void render(){
        ui.stroke(255);
        float middle = ui.height / 2; 
        for(int i = 0 ; i < ai.bufferSize() ; i ++)
        {
            ui.stroke(ui.map(i, 0, ai.bufferSize(), 0, 255), 255, 255);
            ui.line(i, middle, i, middle + ai.left.get(i) *middle);
        }

        fft.forward(ai.left);

        for(int i = 0 ; i < fft.specSize() ; i ++)
        {
            ui.stroke(ui.map(i, 0, ai.bufferSize(), 0, 255), 255, 255);            
            ui.line(i, 0, i, fft.getBand(i) * 20);
        }
    }
}