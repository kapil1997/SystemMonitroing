/**
 * 
 * 
 */
package myproject;
import java.util.ArrayList;
import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

/**
 * @author 
 *
 */
public class TwitterSentimentAnalysis {

    public static int status;
    
	/**
	 * @param args
	 */
	
	//Your Twitter App's Consumer Key
   private static  String consumerKey = "bRA3T1HiX1mcrMImKliMUSUUW";
		
		
		//Your Twitter App's Consumer Secret
	    private static String consumerSecret ="0XOhLwGY9YctXtODG4BsjHHdw5mQBGubjOg4lHQAz1t1pLBwG9";
		
	    
	  //Your Twitter Access Token
	    private static String accessToken = "949600639323070464-sROgV6eJHbzGs95T9H5wVWBU4VTWnQr";
	    
	    
	    //Your Twitter Access Token Secret
	    private static String accessTokenSecret = "Qxt6eVXsZNzA9TI8yEGDBoHlDoLmRgGBBxwqA0EDff5lx";
	    
	
		
	
	public static ArrayList<String> getTweets(String topic) {
		
		TwitterFactory twitterFactory = new TwitterFactory();
	     
        //Instantiate a new Twitter instance
        Twitter twitter = twitterFactory.getInstance();
       
       
 
        //setup OAuth Consumer Credentials
        twitter.setOAuthConsumer(consumerKey, consumerSecret);
 
        //setup OAuth Access Token
        twitter.setOAuthAccessToken(new AccessToken(accessToken, accessTokenSecret));

		//Twitter twitter = new TwitterFactory().getInstance();
		ArrayList<String> tweetList = new ArrayList<String>();
		try {
			Query query = new Query(topic);
			query.setCount(1000);
			QueryResult result;
		
				result = twitter.search(query);
				List<Status> tweets = result.getTweets();
					for (Status tweet : tweets) {
					//System.out.println(tweet.getText());
					
					String extractedTweet = tweet.getText();
					tweetList.add(extractedTweet);
				}
		} catch (TwitterException te) {
			te.printStackTrace();
			System.out.println("Failed to search tweets: " + te.getMessage());
		}
		
				return tweetList;
	}
	
	
	public void callme(String giveme)
        {
          int count=0;
               status=1;
                String tp=giveme;
                String topic = "alwar";
                System.out.println("hello"+topic);
		ArrayList<String> tweets = TwitterSentimentAnalysis.getTweets(topic);
				for(String tweet : tweets) {
			count++;
			//System.out.println(tweet);
			System.out.println(count+"->"+ tweet+"\n");
		  
        }
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		}
}