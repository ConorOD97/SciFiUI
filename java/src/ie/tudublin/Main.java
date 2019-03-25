package ie.tudublin;

public class Main
{	
	public void Interface(){
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Interface());
	}
	public void Star(){
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Star());
	}
	public void MoveLine(){
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new MoveLine());
	}
	public void Radar(){
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Radar());
	}

	
	public static void main(String[] args)
	{
		Main main = new Main();
		//main.Interface();
		//main.Star();
		//main.MoveLine();
		main.Radar();		
	}
}