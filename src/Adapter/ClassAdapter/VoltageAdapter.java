package Adapter.ClassAdapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        int srcVolt = output();
        float targetVolt = (5.0f / srcVolt) * srcVolt;
        System.out.println("Adapter OUT: 5V.");
        return (int)targetVolt;
    }
}
