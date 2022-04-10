import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(600, 400);

    
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(51, 204, 255);
    
  }

  public void draw() {

    // change width and height here
    float width = 600;
    float height = 400;

    // scale factor
    float scaleFactorW = width / 400;
    float scaleFactorH = height / 400;

	  // yellow sun
    fill(255, 255, 0);
    ellipse(scaleFactorW *0, scaleFactorH *0, scaleFactorW *150, scaleFactorH *150);

    // green rectangle
    fill(0,255,0);
    rect(scaleFactorW *0, scaleFactorH *320, scaleFactorW *400, scaleFactorH *430);

    // tan rectangle  
    fill(210, 180, 140);
    rect(scaleFactorW *95, scaleFactorH *150, scaleFactorW *210, scaleFactorH *180);

    // light red chimney
    fill(255, 127, 127);
    rect(scaleFactorW *250, scaleFactorH *85, scaleFactorW *30, scaleFactorH *50);

    // red chimney crown
    fill(255, 51, 51);
    rect(scaleFactorW *245, scaleFactorH *80, scaleFactorW *40, scaleFactorH *10);

    // red triangle roof
    fill(255, 51, 51);
    triangle(scaleFactorW *80, scaleFactorH *150, scaleFactorW *200, scaleFactorH *70, scaleFactorW *320, scaleFactorH *150);

    // left rectangle window
    fill(51, 153, 255);
    rect(scaleFactorW *115, scaleFactorH *180, scaleFactorW *55, scaleFactorH *55);

    // vertical left window line
    line(scaleFactorW *143, scaleFactorH *180, scaleFactorW *143, scaleFactorH *235);

    // horizontal left window line
    line(scaleFactorW *115, scaleFactorH *206, scaleFactorW *170, scaleFactorH *206);

    // right rectangle window
    fill(51, 153, 255);
    rect(scaleFactorW *230, scaleFactorH *180, scaleFactorW *55, scaleFactorH *55);

    // vertical right window line
    line(scaleFactorW *259, scaleFactorH *180, scaleFactorW *259, scaleFactorH *235);

    // horizontal right window line
    line(scaleFactorW *230, scaleFactorH *205, scaleFactorW *285, scaleFactorH *205);

    // orange door 
    fill(255, 204, 0);
    rect(scaleFactorW *180, scaleFactorH *260, scaleFactorW *45, scaleFactorH *70);

    // brown doorknob
    fill(101, 67, 33);
    ellipse(scaleFactorW *190, scaleFactorH *295, scaleFactorW *7, scaleFactorH *7);

    // grey pathway
    fill(211, 211, 211);
    rect(scaleFactorW *180, scaleFactorH *330, scaleFactorW *45, scaleFactorH *200);

  }
  
}