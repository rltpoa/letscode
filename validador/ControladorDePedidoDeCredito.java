import java.util.ArrayList;
import java.util.List;


public class ControladorDePedidoDeCredito {

    public List<Validador> validadores = new ArrayList<Validador>();

    public ControladorDePedidoDeCredito() {
        this.validadores.add(new ValidadorDeNulosImpl());
        this.validadores.add(new ValidadorMaiorDeIdadeImpl());
        this.validadores.add(new ValidadorCPFImpl());
        this.validadores.add(new ValidadorTempoDeContaMaiorQueUmAnoImpl());
        this.validadores.add(new ValidadorContaSalarioSaldoImpl());
    }

    public void processar(PedidoDeCredito pedidoDeCredito) throws PedidoDeCreditoException {
        for (Validador validador : this.validadores) {
            validador.validar(pedidoDeCredito);
        }
    }

}
