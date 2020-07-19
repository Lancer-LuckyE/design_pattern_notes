package Adapter.ClassAdapter;

public class Phone {
    public void charge(IVoltage5V iVoltage5V) {
        if (iVoltage5V.output5V()  == 5) {
            System.out.println("Input voltage: 5V. Cell phone is charging.");
        } else if (iVoltage5V.output5V() < 5) {
            System.out.println("Input voltage too low.");
        } else {
            System.out.println("WARNING: Input voltage is to too high.");
        }
    }
}
