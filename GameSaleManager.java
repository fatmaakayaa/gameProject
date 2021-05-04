package gameProjectD4Hw3;

public class GameSaleManager implements GameService {
	
	@Override
	public void sell(Player player, GameCampaign gameCampaign, Game game) {
	System.out.println(player.getFirstName()+" "+player.getLastName()+" isimli oyuncu "+ game.getGameName()+ " oyununu "+ gameCampaign.getCampaignName()+" kampanyasý ile " 
			+ Game.getGamePrice()+" TL yerine "+ gameCampaign.getLastPrice()+" TL'ye satýn aldý.");
	}
}