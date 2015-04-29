import java.util.ArrayList;

/**
 * Write a description of class MessagePost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MessagePost
{
    private String username;
    private String message;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class MessagePost
     */
    public MessagePost(String autor, String text)
    {
        // initialise instance variables
       this.username = autor;
       this.message = text;
       this.timestamp = System.currentTimeMillis();
       this.likes = 0;
       comments = new ArrayList<String>();
    }


}
