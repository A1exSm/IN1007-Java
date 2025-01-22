package weekTen;
import java.util.HashMap;
import java.util.Map;
class MapToPrice {
    private Map<ChristmasGift, Integer> myMap;
    // constructor
    protected MapToPrice() {
        this.myMap = new HashMap<>();
        // new HashMap<ChristmasGift, Integer>()
    }
    // getters and setters
    protected void setMyMap(Map<ChristmasGift, Integer> myMap) {
        this.myMap = myMap;
    }
    protected void addToMap(ChristmasGift christmasGift) {
        this.myMap.put(christmasGift, christmasGift.getPrice());
    }
    protected Map<ChristmasGift, Integer> getMyMap() {
        return myMap;
    }
    // method
    protected void greaterValue(int i) {
        for (Map.Entry<ChristmasGift, Integer> entry : this.myMap.entrySet()) {
            if (entry.getValue() >= i) {
                System.out.println(entry.getKey().getName());
            }
        }
    }
}
