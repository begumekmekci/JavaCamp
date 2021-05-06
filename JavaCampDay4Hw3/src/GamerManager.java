
public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;
	
	
	
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
		System.out.println("Added : " + gamer.getFirstName());
		}
		else {
			System.out.println("Invalid");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
		System.out.println("Deleted : " + gamer.getFirstName());
		}
		else {
			System.out.println("Invalid");
		}
	}

	@Override
	public void update(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
		System.out.println("Updated : " + gamer.getFirstName());
		}
		else {
			System.out.println("Invalid");
		}
	}
 
    
}
