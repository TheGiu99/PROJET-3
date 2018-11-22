import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class StateGame extends StateBasedGame{

	public static void main(String[] args) throws SlickException {
		new AppGameContainer(new StateGame(), 800, 500, false).start();
	}
	
	public StateGame() {
		super("Lesson 15 :: StateGame");
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException {
		addState(new MainScreenGameState());
	    addState(new MapGameState());
	}
	
}
