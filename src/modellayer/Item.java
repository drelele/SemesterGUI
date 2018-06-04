package modellayer;


/**
 * Lav en beskrivelse af klassen Item her.
 * 
 * @author (dit navn her)
 * @version (versions nummer eller dato her)
 */
public class Item
{
    private static int count = 1;
    private String serialCode;
    
    public Item()
    {
        serialCode = Integer.toString(count);
        count++;
    }
    
    public String getSerialCode()
    {
        return serialCode;
    }
}
