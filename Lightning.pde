int startX = 250;
int startY = 0;
int endX = 0;
int endY = 0;
int i = 0;

void setup()
{
	background(0,0,0);
	stroke(0, 150 +i*5, 240 -i*2);	
	strokeWeight(1);
	size(500,500);
	frameRate(250);
}
void draw()
{
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
/*void mousePressed()
{
	
	startX = 0;
	startY = 0;
	endX = 0;
	endY = 0;
	
	
}*/

