import java.util.ArrayList;

/**
 * Write a description of class NewsFeed here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;

    /**
     * Constructor for objects of class NewsFeed
     */
    public NewsFeed()
    {
        // initialise instance variables
        messages = new ArrayList<MessagePost>();
        photos = new ArrayList<PhotoPost>();
    }

    /**
     * Añade un mensaje al muro de noticias
     * @param message el mensaje a añadir
     */
    public void addMessagePost(MessagePost message)
    {
        messages.add(message);
    }

    /**
     * Añade un mensaje con foto al muro de noticias
     * @param photo el mensaje con foto a añadir
     */
    public void addPhotoPost(PhotoPost photo)
    {
        photos.add(photo);
    }

    /**
     * Muestra los mensajes en el muro de noticias, primero muestra
     * los mensajes normales y luego los que tienen foto
     */
    public void show()
    {
        // Muestra los mensajes normales
        for(int i = 0; i < messages.size(); i++)
        {
            messages.get(i).display();
        }
        // Muestra los mensajes con foto
        for(int e = 0; e < photos.size(); e++)
        {
            photos.get(e).display();
        }
    }
}
