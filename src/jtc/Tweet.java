
package jtc;

/**
 *
 * @author Jared Ren, Tyler Steward
 */
public class Tweet {
    private String text;
    private String topic;
    private String hashtag;

    public Tweet(String text, String topic, String hashtag) {
        this.text = text;
        this.topic = topic;
        this.hashtag = hashtag;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getHashtag() {
        return hashtag;
    }
    
    public String getTopic() {
        return topic;
    } 
    
    public String getText() {
        return text;
    }
    
}
