package gameLevel;

public class GameTest {

	public static void main(String[] args) {
		Player player = new Player();
		player.play(1);
		
		PlayerLevel alevel = new AdvancedLevel();
		player.upgradeLevel(alevel);
		player.play(2);
		
		PlayerLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
	}

}
