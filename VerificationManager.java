package gameProjectD4Hw3;

public class VerificationManager implements Verification {
	
	@Override
	public boolean checkPlayer(Player player) {
		if (player.getNationaltyId().length() == 11) {
			System.out.println("Do�rulama ger�ekle�tirildi.");
			return true;
		}
		else 
			System.out.println("Do�rulama ger�ekle�tirilemedi.");
			return false;
	}

		
}
