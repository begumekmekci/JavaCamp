
public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		
		Gamer gamer = new Gamer("Begüm", "Ekmekçi", 1999, "123456");
		gamerManager.add(gamer);
		
		Game game = new Game("Game", 100);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		
		Campaign campaign = new Campaign("Campaign", 10);
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.discountRate(campaign, game);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sellGameWithCampaign(game, gamer, campaign);

	}

}
