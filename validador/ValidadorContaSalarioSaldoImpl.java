public class ValidadorContaSalarioSaldoImpl implements Validador {

    public static final Double VALOR_MINIMO = 1500.0;

    @Override
    public void validar(PedidoDeCredito pedidoDeCredito) throws PedidoDeCreditoException {
        if (pedidoDeCredito.isContaSalario() && pedidoDeCredito.getSalarioMensal() < VALOR_MINIMO) {
            throw new PedidoDeCreditoException("A conta salário deve possuir saldo maior que " + VALOR_MINIMO + " reais");
        }
    }

}
