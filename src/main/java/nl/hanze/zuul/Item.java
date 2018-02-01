
/**
 * class Item - geef hier een beschrijving van deze class
 *
 * @author (G de Graaff)
 * @version (1-2-2018)
 */
public class Item {
    // Instantie variabelen
    private String name;
    private String description;
    private int weight;

    /**
     * Constructor voor objects van class Item
     */
    public Item(String name, String description, int weight)
    {
        // geef de instance variables een beginwaarde
        this.name = name;
        this.description = description;
        this.weight = weight;
    }

    /**
     * in onderstaande getmethodes worden de naam, de beschrijving en het gewicht van het item teruggegeven
     */
    public String getName()
    {
        return name;
    }
    
    public String getdiscription()
    {
        return description;
    }
    
    public int getWeight()
    {
        return weight;   
    }
}
