package itration.itration1;

import itration.itration1.SuperContraGame;

public class GameRunner {

	private SuperContraGame game;

	public GameRunner(SuperContraGame game) {
		this.game = game;
	}

	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}
}