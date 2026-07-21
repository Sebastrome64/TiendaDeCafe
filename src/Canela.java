public class Canela extends BebidaDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", canela";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.75;
    }
}