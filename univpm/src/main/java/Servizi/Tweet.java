package Servizi;

public class Tweet {
	
	private String date;
	private int TweetID;
	private String TweetText;
	
	
	public Tweet(String created_at, int id_str) {
	    date = created_at;
		TweetID = id_str;
		
	}
	
	public int ContaCaratteri() {
		
		return TweetText.length();
	}

}



