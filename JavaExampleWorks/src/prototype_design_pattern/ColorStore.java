package prototype_design_pattern;

import java.util.HashMap;
import java.util.Map;
/*Blue ve Black color sınıflarının map tipinde eklenmesi ve Mainden gelen
color isim anahtarlarının alınarak klonlanması işlemi yapılır.
*/
public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<>();

    static
    {
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName)
    {
        return (Color) colorMap.get(colorName).clone();
    }
}
