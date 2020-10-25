void setup() {
  background(255);
	size(500, 500);
  frameRate(20);
}

  int rectangleX = random(0, 400);
  int rectangleY = random(0, 300);
  int rectangleWidth = random(100, 400);
  int rectangleHeight = random(100, 400);

  int color1 = random(0, 255);
  int color2 = random(0, 255);
  int color3 = random(0, 255);

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)
  
 if (mousePressed){
   
    background(255);

  int rectangleX = random(0, 400);
  int rectangleY = random(0, 300);
  int rectangleWidth = random(100, 400);
  int rectangleHeight = random(100, 400);

  int color1 = random(0, 255);
  int color2 = random(0, 255);
  int color3 = random(0, 255);
    
 }

  //rectangle coding
  fill(color1, color2, color3);

  rect(rectangleX, rectangleY, rectangleWidth, rectangleHeight);

  //ellipse randomness
  fill(random(0, 255), random(0, 255), random(0, 255));
  
  stroke(0);

  ellipse(mouseX + random(-30, 30), mouseY + random(-30, 30), 10, 10);


}