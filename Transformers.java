import java.util.Scanner;

public class Transformers {

	
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		//boolean loop = true;
		
		//while(loop) {
		System.out.println("Welcome! Please select your faction! A for Autbots or D for Decepticons. Press q to quit!");
		char faction = kb.nextLine().trim().toLowerCase().charAt(0);
		
		switch(faction) {
		case 'a':
			Autobots();
			break;
		case 'd':
			Decepticons();
			break;
		//case 'q':
			//loop = false;
		default:
			System.out.println("Program ended!");
			break;
		}

		
		}
		
	
	
	private static void Autobots() {
		System.out.println("You have chosen the Autobots!");
		System.out.println("");
		System.out.println("Freedom is the right of all setient beings.");
		System.out.println("");
		System.out.println("Autobots transform and roll out!");
		System.out.println("");
		
		Scanner kb2 = new Scanner(System.in);
		System.out.println("Choose your Autobot!");
		System.out.println("");
		System.out.println("1 - Optimus Prime \n2 - Bumblebee \n3 - Ironhide \n4 - Ratchet \n5 - Jazz \n6 - Wheeljack \n7 - Blaster");
		System.out.println("");
		System.out.println("My choice:");
		char AutobotsSelect = kb2.nextLine().trim().charAt(0);
	
		switch(AutobotsSelect) {
		case '1':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Optimus Prime");
			System.out.println("");
			System.out.println("Leader of the Autobots");
			System.out.println("");
			break;
		case '2':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Bumblebee");
			System.out.println("");
			System.out.println("Autobot Scout");
			System.out.println("");
			break;
		case '3':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Ironhide");
			System.out.println("");
			System.out.println("Autobot Weapon Specalist");
			System.out.println("");
			break;
		case '4':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Ratchet");
			System.out.println("");
			System.out.println("Autobot Medic");
			System.out.println("");
			break;
		case '5':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Jazz");
			System.out.println("");
			System.out.println("Autobot Lieutenant");
			System.out.println("");
			break;
		case '6':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Wheeljack");
			System.out.println("");
			System.out.println("Autobot Scientist");
			System.out.println("");
			break;
		case '7':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Blaster");
			System.out.println("");
			System.out.println("Autobot Intelligence Officer");
			System.out.println("");
			break;
		}


	}
	
	private static void Decepticons() {
		System.out.println("You have chosen the Decepticons!");
		System.out.println("");
		System.out.println("Peace through tyranny!");
		System.out.println("");
		System.out.println("Decepticons transform and rise up!");
		System.out.println("");
		
		Scanner kb3 = new Scanner(System.in);
		System.out.println("Choose your Decepticon!");
		System.out.println("");
		System.out.println("1 - Megatron \n2 - Starscream \n3 - Soundwave \n4 - Shockwave\n5 - Astrotrain \n6 - Thundercracker \n7 - Skywarp");
		System.out.println("");
		System.out.println("My choice:");
		char DecepticonSelect = kb3.nextLine().trim().charAt(0);
		
		switch(DecepticonSelect) {
		case '1':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Megatron");
			System.out.println("");
			System.out.println("Leader of the Decepticons");
			System.out.println("");
			break;
		case '2':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Starscream");
			System.out.println("");
			System.out.println("Leader of the Seekers");
			System.out.println("");
			break;
		case '3':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Soundwave");
			System.out.println("");
			System.out.println("Decepticon Intelligence Officer");
			System.out.println("");
			break;
		case '4':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Shockwave");
			System.out.println("");
			System.out.println("Decepticon Scientist");
			System.out.println("");
			break;
		case '5':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Astrotrain");
			System.out.println("");
			System.out.println("Decepticon Triple Changer");
			System.out.println("");
			break;
		case '6':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Thundercracker");
			System.out.println("");
			System.out.println("Decepticon Seeker");
			System.out.println("");
			break;
		case '7':
			System.out.println("You have chosen:");
			System.out.println("");
			System.out.println("Skywarp");
			System.out.println("");
			System.out.println("Decepticon Seeker");
			System.out.println("");
			break;
		}
	}
}
	

