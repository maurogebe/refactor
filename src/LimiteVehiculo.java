public class LimiteVehiculo {

    private String tipoVehiculo;
    private int limiteInferior;
    private int limiteInferiorIntermedio;
    private int limiteSuperior;

    public LimiteVehiculo(String tipoVehiculo, int limiteInferior, int limiteInferiorIntermedio, int limiteSuperior) {
        this.tipoVehiculo = tipoVehiculo;
        this.limiteInferior = limiteInferior;
        this.limiteInferiorIntermedio = limiteInferiorIntermedio;
        this.limiteSuperior = limiteSuperior;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public int getLimiteInferior() {
        return limiteInferior;
    }

    public int getLimiteInferiorIntermedio() {
        return limiteInferiorIntermedio;
    }

    public int getLimiteSuperior() {
        return limiteSuperior;
    }
}
