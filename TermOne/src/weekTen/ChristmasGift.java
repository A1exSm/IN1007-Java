package weekTen;

class ChristmasGift {
    private String name;
    private String recipient;
    private int price;
    // constructor
    protected ChristmasGift(String name, String recipient, int price) {
        this.name = name;
        this.recipient = recipient;
        this.price = price;
    }
    // getters and setters
    protected String getName() {
        return this.name;
    }
    protected String getRecipient() {
        return this.recipient;
    }
    protected int getPrice() {
        return this.price;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    protected void setPrice(int price) {
        this.price = price;
    }
}
