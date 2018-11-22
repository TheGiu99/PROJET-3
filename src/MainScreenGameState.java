import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainScreenGameState extends BasicGameState{

	public static final int ID = 1;
	  private Image background;
	  private StateBasedGame game;

	  @Override
	  public void init(GameContainer container, StateBasedGame game) throws SlickException {
	    this.game = game;
	    this.background = new Image("resources/menu/lord_rvf_01.png");
	  }

	  @Override
	  public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
	    background.draw(0, 0, container.getWidth(), container.getHeight());
	    g.drawString("Appuyer sur la barre espace pour jouer", 1600/2, 1900/2);
	  }

	  @Override
	  public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
	  }
	  
	  @Override
	  public void keyPressed(int key, char c) {
		  if(Input.KEY_SPACE==key){
			  game.enterState(MapGameState.ID);
		  }
	  }

	  @Override
	  public int getID() {
	    return ID;
	  }
}
