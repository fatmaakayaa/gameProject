package gameProjectD4Hw3;

public class PlayerManager implements PlayerService {
	
	private VerificationManager verificationManager;
	
	public PlayerManager(VerificationManager verificationManager) {
		this.verificationManager = verificationManager;
		}
	
@Override
	public void signUp(Player player) {
		if (verificationManager.checkPlayer(player) == true) {
			System.out.println("Kaydýnýz baþarýlý bir þekilde gerçekleþti. Hoþgeldin : " + player.getFirstName() + " " + player.getLastName() + " :) " );
		}
			else
				System.out.println("Bilgilerinizi doðru girdiðinizden emin olunuz "+ player.getFirstName()+" "+ player.getLastName()+ " ! ");
			
		}

@Override
	public void update(Player player) {
		if(verificationManager.checkPlayer(player)==true) {
			System.out.println("Kaydýnýz güncellendi "+ player.getFirstName()+" "+ player.getLastName()+"!");
		}
			else
				System.out.println("Kaydýnýz güncellenemedi!");
	
		}

@Override
	public void delete(Player player) {
		if(verificationManager.checkPlayer(player)==true) {
			System.out.println("Kaydýnýz silindi!");
		}
			else
				System.out.println("Kaydýnýz silinemedi!");
	
	
}
}

