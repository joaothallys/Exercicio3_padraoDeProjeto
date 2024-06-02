public class AlertSystem implements Observer {
    private float temperature;

    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        alert();
    }

    public void alert() {
        if (temperature > 30) {
            System.out.println("Sistema de Alerta: A temperatura está muito alta! A temperatura atual e " + temperature + " graus.");
        }
    }
}
