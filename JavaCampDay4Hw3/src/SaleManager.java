
public class SaleManager implements SaleService {

	@Override
	public void sellGameWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		System.out.println("Gamer " + gamer.getFirstName() +" "+gamer.getLastName()+ " bought the " + game.getGameName() + " with the updated price " + game.getGamePrice() + " after the campaign.");
		
	}

}
