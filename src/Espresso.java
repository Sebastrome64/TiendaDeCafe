public class Espresso implements Bebida {
    @Override
    public String getDescripcion() {
        return "Espresso";
    }

    @Override
    public double getCosto() {
        return 6.00;
    }
}
