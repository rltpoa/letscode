import java.util.Objects;

public class ValidadorDeNulosImpl implements Validador {

    @Override
    public void validar(PedidoDeCredito pedidoDeCredito) throws PedidoDeCreditoException {
        if (Objects.isNull(pedidoDeCredito)) {
            throw new PedidoDeCreditoException("Pedido de crédito é nulo");
        }

        if (Objects.isNull(pedidoDeCredito.getNome())) {
            throw new PedidoDeCreditoException("O campo 'nome' está nulo");
        }

        if (Objects.isNull(pedidoDeCredito.getSobrenome())) {
            throw new PedidoDeCreditoException("O campo do 'sobrenome' está nulo");
        }

        if (Objects.isNull(pedidoDeCredito.getDataNascimento())) {
            throw new PedidoDeCreditoException("O campo 'dataNascimento' está nulo");
        }

        if (Objects.isNull(pedidoDeCredito.getDataAberturaConta())) {
            throw new PedidoDeCreditoException("O campo 'dataAberturaConta' está nulo");
        }

        if (Objects.isNull(pedidoDeCredito.getCPF())) {
            throw new PedidoDeCreditoException("O campo 'CPF' está nulo");
        }
    }

}
