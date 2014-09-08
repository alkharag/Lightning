import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX = 250;
int startY = 0;
int endX = 0;
int endY = 0;
int i = 0;

public void setup()
{
	background(0,0,0);
	size(500,500);
	
	frameRate(250);
}
public void draw()
{
	stroke(0, 150 +i*5, 240 -i*2);	
	strokeWeight(3);
	while (endY < 500) {
		endX = startX + (int)(Math.random()*18-9);
		endY = startY + (int)((Math.random()*10));


		line(startX,startY,endX,endY);
		startX = endX;
		startY = endY;
	}
	if (endY > 499) {
		startX = 250; //(int)(Math.random()*300);
		startY = 0;
		endX = 0;
		endY = 0;
		i++;
	}
	if(i > 3){
		background(0,0,0);
		i = 0;
	}
	

}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
