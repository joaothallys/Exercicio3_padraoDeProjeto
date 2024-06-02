public class DisplayDevice implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    public void display() {
        System.out.println("Dispositivo de exibição: A temperatura atual e " + temperature + " graus.");
    }
}
