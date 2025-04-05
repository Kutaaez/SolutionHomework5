package flyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();
    private static int totalMarkersCreated = 0;

    public static MarkerStyle getStyle(String type, String color) {
        String key = type + color;
        totalMarkersCreated++;

        if (!styles.containsKey(key)) {
            switch (type) {
                case "restaurant":
                    styles.put(key, new RestaurantMarker(color));
                    break;
                case "shop":
                    styles.put(key, new ShopMarker(color));
                    break;
            }
        }
        return styles.get(key);
    }
    public static int getTotalStyles() {
        return styles.size();
    }
    public static int getTotalMarkersCreated() {
        return totalMarkersCreated;
    }
}