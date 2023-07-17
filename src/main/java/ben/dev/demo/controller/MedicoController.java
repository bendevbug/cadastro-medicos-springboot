package ben.dev.demo.controller;


import ben.dev.demo.endereco.Endereco;
import ben.dev.demo.medico.DadosCadastroMedicos;
import ben.dev.demo.medico.Medico;
import ben.dev.demo.medico.MedicoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lista-medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastroMedicos dados) {
        repository.save(new Medico(dados));
    }

}
