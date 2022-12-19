import java.time.LocalDate;
import java.time.Period;

public class ValidadorMaiorDeIdadeImpl implements Validador {

    private static final Integer IDADE_MINIMA = 18;

    @Override
    public void validar(PedidoDeCredito pedidoDeCredito) throws PedidoDeCreditoException {
        LocalDate dataNascimento = pedidoDeCredito.getDataNascimento();

        int idade = Period
            .between(dataNascimento, LocalDate.now())
            .getYears();

        if (idade < IDADE_MINIMA) {
            throw new PedidoDeCreditoException("Idade deve ser maior ou igual a " + IDADE_MINIMA + " anos");
        }
    }

}
