package weekTen;
import weekThree.WeekThree;
import java.util.ArrayList;
public class WeekTen {
    WeekThree weekThree = new WeekThree();
    public void run() {
        switch (weekThree.inputInt("Which function would you like to run? ")) {
            case 1 -> exerciseOne();
            case 2 -> exerciseTwo();
            default -> System.out.println("Invalid input");
        }
    }

    ArrayList<ChristmasGift> allGifts = new ArrayList<>() {
        {
        add(new ChristmasGift("Choco", "Alex", 30));
        add(new ChristmasGift("car", "Mike", 30000));
        add(new ChristmasGift("House", "Yusuf", 1000000));
        add(new ChristmasGift("plane", "Daren", 3000000));
        add(new ChristmasGift("purse", "Haley", 90));
        add(new ChristmasGift("game", "Asher", 60));
        }
    };
    MyChristmasList gifts = new MyChristmasList(allGifts);


    private void printRecipients(MyChristmasList giftList) {
        for (ChristmasGift gift : giftList.getMyList()) {
            System.out.println(gift.getRecipient());
        }
    }
    private ChristmasGift mostExpensiveGift(MyChristmasList list) {
        int[] temp = {0,0}; // {index,price}
        int index = 0;
        for (ChristmasGift gift : list.getMyList()) {
            if (gift.getPrice() > temp[1]) {
                temp[1] = gift.getPrice();
                temp[0] = index;
            }
            index++;
        }
        ArrayList<ChristmasGift> tempList = list.getMyList();
        return tempList.get(temp[0]);
    }

    private void exerciseOne() {
        printRecipients(gifts);
        ChristmasGift mostExpensive = mostExpensiveGift(gifts);
        System.out.println(
                "The most expensive gift is " + mostExpensive.getName() +
                        " Recipient: " + mostExpensive.getRecipient() +
                                ", price: " + mostExpensive.getPrice()
        );
    }
    private boolean searchMap(MapToPrice m, int value) {
        return m.getMyMap().containsValue(value);
    }
    private void exerciseTwo() {
        MapToPrice map = new MapToPrice();
        for (ChristmasGift gift : gifts.getMyList()) {
            map.addToMap(gift);
        }
        System.out.println(searchMap(map, 30));
        System.out.println(searchMap(map, 69));
        map.greaterValue(50000);
    }
}
