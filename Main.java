package gameProjectD4Hw3;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		player1.setFirstName("Fatma");
		player1.setLastName("Kaya");
		player1.setNationaltyId("11111111111");
		player1.setYearOfBirth("2000");
		
		Player player2 = new Player();
		player2.setFirstName("Melis");
		player2.setLastName("Ocakoðlu");
		player2.setNationaltyId("222222");
		player2.setYearOfBirth("1999");
		
		Game game1= new Game();
		game1.setId(1);
		game1.setGameName("Counter Strike Global Offensive");
		game1.setGamePrice(127);
		
		Game game2= new Game();
		game2.setId(2);
		game2.setGameName("League of Legends");
		game2.setGamePrice(216);
		
		Game game3= new Game();
		game3.setId(3);
		game3.setGameName("Valorant");
		game3.setGamePrice(390);
		
		GameCampaign gameCampaign1 = new GameCampaign();
		gameCampaign1.setId(1);
		gameCampaign1.setCampaignName("Summer season");
		gameCampaign1.setDetail(" Bu kampanya %50 indirim uygulamaktadýr !");
		
		PlayerManager playerManager=new PlayerManager(new VerificationManager());
		playerManager.signUp(player1);
		playerManager.update(player1);
		System.out.println("-----------------------");
		
		playerManager.signUp(player2);
		System.out.println("-----------------------");
		
		GameCampaignManager gameCampaignManager=new GameCampaignManager();
		gameCampaignManager.add(gameCampaign1);
		gameCampaignManager.update(gameCampaign1);
		System.out.println("-----------------------");
		
		GameSaleManager gameSaleManager= new GameSaleManager();
		gameSaleManager.sell(player1, gameCampaign1, game2);
		

	}

}
