package beersong;

public class BeerSong {

	public static void Ninety_Nine_Bottles_of_Beer(int bottles){        
		if(bottles == 0){
			System.out.println();
			System.out.println("No more bottles of beer on the wall, no bottles of beer.");
			System.out.println("Go to the store and buy some more, " + (bottles + 99) + " bottles of beer on the wall.");
		} else if( bottles == 1){
			System.out.println(bottles + " bottle of beer on the wall, " + bottles + " bottle of beer,take one");
			System.out.println("down and pass it around, no more bottles of beer on the wall.");
			System.out.println();
		}
		else {
			System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer, take one");
			System.out.println("down, and pass it around, " + (bottles -1) + " bottles of beer on the wall.");
			System.out.println();
		}

	}

	public static void main(String[] args) {
		BeerSong beerSong = new BeerSong();
		for (int i = 99; i>=0; i--){
			beerSong.Ninety_Nine_Bottles_of_Beer(i);
		}
	}

}

