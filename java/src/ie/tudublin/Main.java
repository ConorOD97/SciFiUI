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
	public static void main(String[] args)
	{
		Main main = new Main();
		main.Interface();
		//main.Star();		
	}
}