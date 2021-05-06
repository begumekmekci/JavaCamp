
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Added : "+campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Deleted : "+campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Updated : "+campaign.getCampaignName());
		
	}

	@Override
	public void discountRate(Campaign campaign, Game game) {
		System.out.println("Game price before the discount: "+game.getGamePrice());
		double newPrice = game.getGamePrice() - ((game.getGamePrice() * campaign.getDiscountRate() / 100));
		System.out.println("Current price : "+newPrice);
	}


}
