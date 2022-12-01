package io.github.umrodrigues.mscartoes.application;

import io.github.umrodrigues.mscartoes.domain.ClienteCartao;
import io.github.umrodrigues.mscartoes.infra.repository.ClienteCartaoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClienteCartaoService {


    private final ClienteCartaoRepository repository;

    public List<ClienteCartao> ListCartoesbyCpf(String cpf){
        return repository.findByCpf(cpf);
    }
}
