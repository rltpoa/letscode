import java.time.LocalDate;
import java.time.Period;

public class ValidadorTempoDeContaMaiorQueUmAnoImpl implements Validador {

    private static final Integer IDADE_MINIMA = 1;

    @Override
    public void validar(PedidoDeCredito pedidoDeCredito) throws PedidoDeCreditoException {
        LocalDate dataAberturaConta = pedidoDeCredito.getDataAberturaConta();

        int idadeConta = Period
                .between(dataAberturaConta, LocalDate.now())
                .getYears();

        if (idadeConta < IDADE_MINIMA) {
            throw new PedidoDeCreditoException(
                    "Data de Abertura da Conta deve ser maior ou igual a " + IDADE_MINIMA + " anos");
        }
    }

}
