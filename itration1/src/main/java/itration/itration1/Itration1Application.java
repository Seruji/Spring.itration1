package itration.itration1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import itration.itration1.GameRunner;
import itration.itration1.SuperContraGame;

@SpringBootApplication
public class Itration1Application {

	public static void main(String[] args) {
		
		//SpringApplication.run(Itration1Application.class, args);
		
		SuperContraGame game = new SuperContraGame();
		// PacManGame game = new PacManGame();
		
		//MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);

		runner.runGame();
	}

}
