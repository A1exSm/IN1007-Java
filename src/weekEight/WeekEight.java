package weekEight;
import weekThree.WeekThree;

public class WeekEight {
    WeekThree weekThree = new WeekThree();
    public void run() {
        switch (weekThree.inputInt("Which function would you like to run? ")) {
            case 1 -> exerciseOne();
            case 2 -> exerciseTwo();
            default -> System.out.println("Invalid input");
        }
    }
    protected static class ExerciseOne {
        private static class Test {
            protected void run() {
                Singer me = new Singer("Alex", 19);
                if (me.isAdult()) {
                    System.out.println("Adult");
                }
                System.out.println(me.name());
                Duet duet1 = new Duet(new Singer("Chris", 34), new Singer("Maria", 30));
                System.out.println(duet1.areProfessional());
                Duet duet2 = new Duet(me, new Singer("Mark", 20));
                Quatuor quatuor = new Quatuor(duet1, duet2);
                System.out.println(quatuor.duet2.singer1.age());
            }
        }

        private static class Singer {
            private final String name;
            private int age;
            private boolean professional;

            Singer(String name, int age) {
                this.name = name;
                this.age = age;
                this.professional = true;
            }

            protected String name() {
                return name;
            }

            protected int age() {
                return age;
            }

            protected boolean professional() {
                return professional;
            }

            protected void age(int age) {
                if (age >= this.age) {
                    this.age = age;
                }
            }

            protected void reverseProfessional() {
                this.professional = !professional;
            }

            protected boolean isAdult() {
                return this.age > 17;
            }
        }

        private static class Duet {
            private Singer singer1;
            private Singer singer2;

            Duet(Singer singer1, Singer singer2) {
                this.singer1 = singer1;
                this.singer2 = singer2;
            }

            protected Singer getSinger1() {
                return singer1;
            }

            protected Singer getSinger2() {
                return singer2;
            }

            protected void setSinger1(Singer singer1) {
                this.singer1 = singer1;
            }

            protected void setSinger2(Singer singer2) {
                this.singer2 = singer2;
            }

            protected boolean areProfessional() {
                return this.singer1.professional() && this.singer2.professional();
            }
        }

        private static class Quatuor {
            private Duet duet1;
            private Duet duet2;

            Quatuor(Duet duet1, Duet duet2) {
                this.duet1 = duet1;
                this.duet2 = duet2;
            }

            protected Duet getDuet1() {
                return duet1;
            }

            protected Duet getDuet2() {
                return duet2;
            }

            protected void setDuet1(Duet duet1) {
                this.duet1 = duet1;
            }

            protected void setDuet2(Duet duet2) {
                this.duet2 = duet2;
            }
        }
    }
    protected static class ExerciseTwo {
        private static class Test {
            protected void run() {
                Shop shop = new Shop();
                Shop shop2 = new Shop();
                System.out.println(shop.getName());
                shop.setNumberOfArticles(-30);
                System.out.println(shop.getNumberOfArticles());
                shop.setNumberOfArticles(30);
                System.out.println(shop.getNumberOfArticles());
                System.out.println(shop2.getNumberOfArticles());
            }

            protected static boolean checkArticles(Shop shop) {
                return (shop.getNumberOfArticles() == shop.getArticles().length);
            }

            protected static Shop updateStock(Buyer buyer) {
                Shop shop = buyer.getShopToGo();
                int[] array = shop.getArticles();
                for (int articleIndex : buyer.getArticlesToBuy()) {
                    if (array[articleIndex] > 0) {
                        array[articleIndex]--;
                    }
                }
                shop.setArticles(array);
                return shop;
            }
        }

        private static class Shop {
            private String name;
            private int numberOfArticles;
            private int[] articles;
            {
                System.out.println("Welcome to the new shop");
            }
            protected Shop (String name, int numberOfArticles, int[] articles) {
                this.name = name;
                this.numberOfArticles = numberOfArticles;
                this.articles = articles;
            }

            protected Shop() {
                this.name = "shop open soon";
                this.numberOfArticles = 0;
                this.articles = new int[1];
            }

            protected String getName() {
                return name;
            }

            protected int getNumberOfArticles() {
                return numberOfArticles;
            }

            protected int[] getArticles() {
                return articles;
            }

            protected void setName(String name) {
                this.name = name;
            }

            protected void setNumberOfArticles(int numberOfArticles) {
                if (numberOfArticles >= 0) {
                    this.numberOfArticles = numberOfArticles;
                }
            }

            protected void setArticles(int[] articles) {
                boolean allPositive = true;
                for (int article : articles) {
                    if (article < 0) {
                        allPositive = false;
                        break;
                    }
                }
                if (allPositive) {
                    this.articles = articles;
                }
            }

            protected void decrementArticles(int index) {
                if (this.articles[index] > 0) {
                    this.articles[index]--;
                }
            }
        }

        private static class Buyer {
            private Shop shopToGo;
            private int[] articlesToBuy;

            protected Buyer(Shop shopToGo, int[] articlesToBuy) {
                this.shopToGo = shopToGo;
                this.articlesToBuy = articlesToBuy;
            }

            protected Shop getShopToGo() {
                return shopToGo;
            }

            protected int[] getArticlesToBuy() {
                return articlesToBuy;
            }

            protected void setShopToGo(Shop shopToGo) {
                this.shopToGo = shopToGo;
            }

            protected void setArticlesToBuy(int[] articlesToBuy) {
                this.articlesToBuy = articlesToBuy;
            }
        }
    }
    private static void exerciseOne() {
        ExerciseOne.Test test = new ExerciseOne.Test();
        test.run();
    }
    private static void exerciseTwo() {
        ExerciseTwo.Test test = new ExerciseTwo.Test();
        test.run();
    }
}
