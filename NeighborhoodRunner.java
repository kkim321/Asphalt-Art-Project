import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

  // Instantiates a MuralPainter object to paint the background
  MuralPainter bp = new MuralPainter();
  bp.paintBackground("white",16);

  // Instantiates a PokemonBallPainter object to paint the pokemon ball
  PokemonBallPainter pokemonball = new PokemonBallPainter();
  pokemonball.paintPokemonBall("black", "red", "silver");

    
  }
}