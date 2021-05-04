package gameProjectD4Hw3;

public class GameCampaignManager implements GameCampaignService{
	
	@Override
	public void add(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId() + " sayýlý " + gameCampaign.getCampaignName() + " kampanyasý sisteme eklenmiþtir." + gameCampaign.getDetail());
		
	}
	
	@Override
	public void delete(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId() + " sayýlý " + gameCampaign.getCampaignName() + " kampanyasý sistemden silinmiþtir." + gameCampaign.getDetail());
		
	}
	@Override
	public void update(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getId() + " sayýlý " + gameCampaign.getCampaignName() + " kampanyasý güncellenmiþtir." + gameCampaign.getDetail());
		
	}
	
}
