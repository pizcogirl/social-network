import java.util.ArrayList;

/**
 * Esta clase representa los mensajes publicados en la red social asociados a fotos.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PhotoPost
{
    private String username;
    private String filename;
    private String caption;
    private long timestamp;
    private int likes;
    private ArrayList<String> comments;

    /**
     * Constructor for objects of class PhotoPost
     */
    public PhotoPost(String autor, String filename, String caption)
    {
        // initialise instance variables
        this.username = autor;
        this.filename = filename;
        this.caption = caption;
        this.timestamp = System.currentTimeMillis();
        this.likes = 0;
        comments = new ArrayList<String>();
    }

    /**
     * Aumenta el contador de likes en uno
     */
    public void like()
    {
        likes++;
    }

    /**
     * Desminuye el contador de likes en uno. Si es cero no hace nada
     */
    public void unlike()
    {
        if(likes > 0)
        {
            likes--;
        }
    }

    /**
     * Añade un comentario al mensaje
     */
    public void addComment(String text)
    {
        comments.add(text);
    }

    /**
     * Devuelve el texto del mensaje
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Devuelve el texto del mensaje
     */
    public String getCaption()
    {
        return caption;
    }

    /**
     * Devuelve el timestamp del mensaje
     */
    public long getTimestamp()
    {
        return timestamp;
    }

    /**
     * Muestra por pantalla todas las caracteristicas del mensaje
     */
    public void display()
    {
        System.out.println("Autor: " + username);
        System.out.println("Mensaje: " + filename);
        System.out.println(caption);
        System.out.println("Enviado hace " + (timeString(System.currentTimeMillis())));
        System.out.println(likes + " me gusta");
        if(comments.size() > 0){
            for(int i = 0; i < comments.size(); i++)
            {
                System.out.println("    " + comments.get(i));
            }
        }
        else{
            System.out.println("No hay comentarios");
        }
    }

    /**
     * Calcula el tiempo en minutos y segundos desde que fue creado el
     * mensaje hasta el momento pasado por parametro
     * @param El momento con el que se quiere comparar
     * @return El tiempo en minutos y segundos entre la creación del mensaje
     *          y el momento pasado por parametro
     */
    private String timeString(long time)
    {
        long tiempo = (time - timestamp);
        int segundos = (int)(tiempo/1000);
        int minutos = (segundos/60);
        segundos -= minutos*60;
        String texto = minutos + " minutos y " + segundos + " segundos";
        return texto;
    }

}
