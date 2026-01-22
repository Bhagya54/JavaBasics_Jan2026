package assignments;

public class TitleAndArtistDemo {

	String artist;
	String title;
	
	public TitleAndArtistDemo(String title,String artist) {
		this.title=title;
		this.artist=artist;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getArtist() {
		return artist;
	}
	public static void main(String[] args) {
		TitleAndArtistDemo t1 = new TitleAndArtistDemo("Soul Meets Body","Death Cab for Cutie");
		System.out.println("Title is: " + t1.getTitle());
		System.out.println("Artist is: " + t1.getArtist());
	
	}

}
