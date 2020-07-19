package Bridge;

public class Client {
    public static void main(String[] args) {
        Brand Apple = new Apple();
        CellPhone iPhoneX = new FullSizeScreen(Apple);
    }
}
