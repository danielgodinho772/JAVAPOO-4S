package Service;

import Model.Pessoa;
import Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Service;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa atualizarPessoa (Long id, Pessoa newPessoa){
        Pessoa pessoaExiste = pessoaRepository.findById(id);
    }
}
