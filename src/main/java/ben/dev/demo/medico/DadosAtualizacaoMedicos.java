package ben.dev.demo.medico;

import ben.dev.demo.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedicos(@NotNull Long id, String nome, String telefone, DadosEndereco endereco) {

}
