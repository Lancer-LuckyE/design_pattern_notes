package Adapter.ObjectAdapter;

public class VoltageAdapter implements IVoltage5V {
    private Voltage220V voltage220V;
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    public Voltage220V getVoltage220V() {
        return voltage220V;
    }

    @Override
    public int output5V() {
        float targetVolt = 0.0f;
        if (voltage220V != null) {
            int srcVolt = voltage220V.output();
            targetVolt = (5.0f / srcVolt) * srcVolt;
            System.out.println("Adapter OUT: 5V.");
        }
        return (int)targetVolt;
    }
}
