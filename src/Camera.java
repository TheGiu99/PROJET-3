import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

public class Camera {
	private Player player;
	
	public Camera(Player player) {
		this.player = player;
	}
	
	public void place(GameContainer container, Graphics g) {
		g.translate(container.getWidth() / 2 - (int) player.getX(), container.getHeight() / 2 - (int) player.getY());
	}
	
	public void update(GameContainer container) {
		
	}
}
