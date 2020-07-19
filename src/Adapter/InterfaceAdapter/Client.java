package Adapter.InterfaceAdapter;

public class Client {
    public static void main(String[] args) {
        AnimatorListenerAdapter adapter = new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Object animator) {
                System.out.println("Overriding the parent empty implementation.");
            }
        };
        adapter.onAnimationStart(new Object());
    }
}
