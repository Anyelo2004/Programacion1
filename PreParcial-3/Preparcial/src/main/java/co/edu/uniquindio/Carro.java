package co.edu.uniquindio;


public class Carro extends Vehiculo {

    /** Tipo de combustible que utiliza el carro (por ejemplo, gasolina o eléctrico). */
    private TipoCombustible tipoCombustible;

    /** Tipo de servicio del carro (por ejemplo, público o particular). */
    private TipoServicio tipoServicio;

    /**
     * Crea una nueva instancia de {@code Carro} con la placa, tipo de servicio y tipo de combustible especificados.
     *
     * @param placa La placa del carro.
     * @param tipoServicio El tipo de servicio (público o particular).
     * @param tipoCombustible El tipo de combustible (eléctrico, gasolina, etc.).
     */
    public Carro(String placa, TipoServicio tipoServicio, TipoCombustible tipoCombustible) {
        super(placa);
        this.tipoCombustible = tipoCombustible;
        this.tipoServicio = tipoServicio;
    }

    /**
     * Obtiene el tipo de combustible del carro.
     *
     * @return El tipo de combustible.
     */
    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    /**
     * Establece el tipo de combustible del carro.
     *
     * @param tipoCombustible El nuevo tipo de combustible.
     */
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    /**
     * Obtiene el tipo de servicio del carro.
     *
     * @return El tipo de servicio.
     */
    public TipoServicio getTipoServicio() {
        return tipoServicio;
    }

    /**
     * Devuelve una representación en forma de cadena del carro.
     *
     * @return Cadena que representa al carro.
     */
    @Override
    public String toString() {
        return "Carro{" +
                "tipoVehiculo=" + tipoCombustible +
                ", tipoServicio=" + tipoServicio +
                ", placa='" + placa + '\'' +
                ", numeroPeajesPagados=" + numeroPeajesPagados +
                '}';
    }

    /**
     * Calcula el valor del peaje que debe pagar el carro.
     * El valor base es de 10,000. Se aplican descuentos o recargos según el tipo de combustible y servicio:
     * <ul>
     *   <li>35% de descuento si es eléctrico y de servicio público</li>
     *   <li>15% de recargo si es de servicio público</li>
     *   <li>20% de descuento si es eléctrico</li>
     * </ul>
     *
     * @return Valor del peaje calculado.
     */
    @Override
    public double calcularPeaje() {
        double valor = 10000;

        if (getTipoCombustible() == TipoCombustible.ELECTRICO && getTipoServicio() == TipoServicio.PUBLICO) {
            valor = valor - (valor * 0.35);
        } else if (getTipoServicio() == TipoServicio.PUBLICO) {
            valor = valor + (valor * 0.15);
        } else if (getTipoCombustible() == TipoCombustible.ELECTRICO) {
            valor = valor - (valor * 0.20);
        }

        return valor;
    }

    /**
     * Devuelve una descripción detallada del carro.
     *
     * @return Descripción completa del carro.
     */
    @Override
    public String DescripcionDetallada() {
        return "Carro{" +
                "tipoVehiculo=" + tipoCombustible +
                ", tipoServicio=" + tipoServicio +
                ", placa=" + placa +
                ", numeroPeajesPagados=" + numeroPeajesPagados +
                '}';
    }
}
