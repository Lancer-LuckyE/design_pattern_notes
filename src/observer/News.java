package observer;

import java.util.ArrayList;

public class News {
    private ArrayList<Observer> observers;
    private String news;

    public News () {
        this.observers = new ArrayList<>();
        this.news = "";
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
        publishNews();
    }

    public void setNews(String news, Observer ob) {
        this.news = news;
        sendNews(ob);
    }

    private void publishNews(){
        notifyAllObservers();
    }

    private void sendNews(Observer ob){
        notify(ob);
    }

    public void subscribe(Observer ob) {
        observers.add(ob);
    }

    public void unsubscribe(Observer ob) {
        if(observers.contains(ob)) {
            observers.remove(ob);
        }
    }

    private void notify(Observer ob) {
        if (observers.contains(ob)) {
            ob.update(this.news);
        }
    }


    private void notifyAllObservers() {
        for (Observer ob: observers) {
            ob.update(this.news);
        }
    }
}
