package br.cdm.projetocdm.service;

import br.cdm.projetocdm.model.Usuario;
import br.cdm.projetocdm.model.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository _usuarioRepository){
        this.usuarioRepository = _usuarioRepository;
    }
    public List<Usuario> fintAll(){
        return usuarioRepository.findAll();
}

public Usuario save( Usuario usuario) {
    return usuarioRepository.save(usuario);
    }
}
