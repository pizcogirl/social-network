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
    public String getText()
    {
        return message;
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
        System.out.println("Mensaje: " + message);
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
        int segundos = (int)(time/1000);
        int minutos = (segundos/60);
        segundos -= minutos*60;
        String texto = minutos + " minutos y " + segundos + " segundos";
        return texto;
    }

}
