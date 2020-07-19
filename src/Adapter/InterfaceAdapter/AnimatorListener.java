package Adapter.InterfaceAdapter;

public interface AnimatorListener {
    void onAnimationStart(Object animator);
    void onAnimationEnd(Object animator);
    void onAnimationCancel(Object animator);
    void onAnimationRepeat(Object animator);
}
