import org.code.neighborhood.*;

public class PokemonBallPainter extends MuralPainter {

/*
 * Paints the pokemon ball
 */ 
public void paintPokemonBall(String firstColor, String secondColor, String thirdColor) {
  startPosition();
  paintTop(firstColor, secondColor);
  paintBottom(firstColor, secondColor, thirdColor);
  
}

/*
 * Moves the PokemonBall Painter to the starting 
 * position to paint the top
 */
  public void startPosition() {
    move();
    move();
    move();
    move();
    move();
    move();
    turnRight();
    move();
    turnLeft();
    
  }

  /*
   * Paints the top part of the pokemon ball
   */
  public void paintTop(String firstColor, String secondColor) {
    paintLine(firstColor, 4);
    move();
    turnToWest();
  
    paintLine(firstColor, 2);
    paintLine(secondColor, 4);
    paintLine(firstColor, 2);

    turnToEast();

    paintLine(firstColor, 1);
    paintLine(secondColor,2);

    move();
    move();

    paintLine(secondColor, 4);
    paintLine(firstColor, 1);

    turnToWest();
    move();

    paintLine(firstColor, 1);
    paintLine(secondColor, 5);

    move();
    move();

    paintLine(secondColor, 1);
    paintLine(firstColor, 1);

    turnToEast();

    paintLine(firstColor, 1);
    paintLine(secondColor, 2);

    move();

    paintLine(secondColor, 7);
    paintLine(firstColor, 1);

    turnToWest();
    move();

    paintLine(firstColor, 1);
    paintLine(secondColor, 4);
    paintLine(firstColor, 2);
    paintLine(secondColor, 4);
    paintLine(firstColor, 1);

    turnToEast();
    move();

    paintLine(firstColor, 2);
    paintLine(secondColor, 2);
    paintLine(firstColor, 1);

    move();
    move();

    paintLine(firstColor, 1);
    paintLine(secondColor, 2);
    paintLine(firstColor, 2);
    
  }

  /*
   * Paints the bottom part of the pokemon ball
   */
  public void paintBottom(String firstColor, String secondColor, String thirdColor) {
    turnToWest();
    move();

    paintLine(firstColor, 1);

    move();

    paintLine(firstColor, 3);

    move();
    move();

    paintLine(firstColor, 3);

    move();

    paintLine(firstColor, 1);
    
    turnToEast();
    move();
    move();

    paintLine(firstColor, 1);

    move();
    move();
    move();

    paintLine(firstColor, 2);

    move();
    move();

    paintLine(thirdColor, 1);
    paintLine(firstColor, 1);

    turnToWest();
    move();

    paintLine(firstColor, 1);
    paintLine(thirdColor, 3);

    move();
    move();
    move();
    move();
    move();

    paintLine(firstColor, 1);

    turnRight();
    turnToSouth();
    move();
    turnLeft();
    move();

    paintLine(firstColor, 2);

    move();
    move();

    paintLine(thirdColor, 2);
    paintLine(firstColor, 2);

    turnToWest();
    move();
    move();
    move();

    paintLine(firstColor, 4);
    
  }
}