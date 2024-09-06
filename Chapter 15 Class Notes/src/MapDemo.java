import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        /*
         * The Map interface is a generic. The first type is the type
         *  of the key; the second, the type of the value.
         */
        Map<String, Color> favoriteColors = new HashMap<>();

        favoriteColors.put("Tavfik", Color.RED);
        favoriteColors.put("Matthew", Color.BLUE);

        // two different keys can have the same value
        favoriteColors.put("Milan", Color.BLUE);

        // but the same key cannot have two different values
        // instead this code changes the value associated with "Milan"
        favoriteColors.put("Milan", Color.GREEN);

        // create a set of the keys in a map
        Set<String> keys = favoriteColors.keySet();
        for(String key : keys)
        {
            System.out.println(key + " (" + key.hashCode() + "): " +
                favoriteColors.get(key));  
        }
    }
}
