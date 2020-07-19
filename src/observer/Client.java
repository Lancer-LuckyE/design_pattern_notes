package observer;

public class Client {
    public static void main(String[] args) {
        News ottawazine = new News();
        Observer follower1 = new Subscriber1();
        Observer follower2 = new Subscriber2();
        // follower1 follows ottawazine
        ottawazine.subscribe(follower1);
        ottawazine.subscribe(follower2);

        System.out.println("================News================");
        ottawazine.setNews("Bank Street is closing to vehicles for every Saturday since this week.");
        ottawazine.setNews("Ottawa university requires anticheating software during exam.", follower2);
    }
}
