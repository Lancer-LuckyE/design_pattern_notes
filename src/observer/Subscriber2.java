package observer;

public class Subscriber2 implements Observer {
    private String news;

    public Subscriber2() {
        this.news = "";
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(String news) {
        setNews(news);
        System.out.println("Today's news for follower2\n" + news);
    }
}
