package weekTen;
import java.util.ArrayList;
class MyChristmasList {
    private ArrayList<ChristmasGift> myList;
    // constructor
    protected MyChristmasList() {
        myList = new ArrayList<>();
    }
    protected MyChristmasList(ArrayList<ChristmasGift> list) {
        myList = new ArrayList<>(list);
    }
    // getters and setters
    protected void setMyList(ArrayList<ChristmasGift> list) {
        myList = list;
    }
    protected ArrayList<ChristmasGift> getMyList() {
        return myList;
    }
    protected void addToList(ChristmasGift christmasGift) {
        myList.add(christmasGift);
    }

}
