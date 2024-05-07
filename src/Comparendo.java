import java.util.ArrayList;

public class Comparendo {

    private LimiteVehiculo[] limites;

    public Comparendo() {
        this.limites = new LimiteVehiculo[3];
        this.limites[0] = new LimiteVehiculo("CARRO", 65, 66, 85);
        this.limites[1] = new LimiteVehiculo("CAMION", 75, 76, 95);
        this.limites[2] = new LimiteVehiculo("MULA", 95, 96, 110);
    }

    public void construirFotoMulta(int velocidad, String tipoVehiculo) {
        int tipoComparendo = calcularComparendo(velocidad, tipoVehiculo);
        String correo = enviarCorreoFotomulta(tipoVehiculo);
        if(tipoComparendo == -1){
            System.out.println("no hay calculo para el tipo de vehiculo " + tipoVehiculo + " correo: " + correo);
        } else {
            System.out.println("----el tipo de comparendo es: " + tipoComparendo + " ----cuerpo del correo " + correo);
        }

    }

    private int calcularComparendo(int velocidad, String tipoVehiculo) {

        for (LimiteVehiculo limite : this.limites) {
            if(limite.getTipoVehiculo().equals(tipoVehiculo)) {
                if(velocidad <= limite.getLimiteInferior()) {
                    return 0;
                } else if (velocidad >= limite.getLimiteInferiorIntermedio() && velocidad <= limite.getLimiteSuperior()) {
                    return 1;
                }
                return 2;
            }
        }

        return -1;
    }


    private String enviarCorreoFotomulta(String tipoVehiculo) {

        for (LimiteVehiculo limite : this.limites) {
            if(limite.getTipoVehiculo().equals(tipoVehiculo)) {
                String cuerpoMensaje = "//enviando correo para el tipo " + limite.getTipoVehiculo() + ".";
                String asunto = "//asunto: comparendo " + limite.getTipoVehiculo() + ".";
                return asunto + cuerpoMensaje;
            }
        }

        return "enviando correo con vehiculo desconocido";
    }

}
