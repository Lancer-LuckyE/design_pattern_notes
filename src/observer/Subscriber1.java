package observer;

import Facade.SystemFacade;

public class Subscriber1 implements Observer{
    private String news;

    public Subscriber1() {
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
        System.out.println("Today's news for follower1\n" + news);
    }
}
