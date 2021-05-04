package gameProjectD4Hw3;

public class Game {

	private int id;
	private String gameName;
	public static double gamePrice;
	
	public Game(int id, String gameName, double gamePrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		Game.gamePrice = gamePrice;
	}
	public Game() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public static double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		Game.gamePrice = gamePrice;
	}

	

	
	
}
