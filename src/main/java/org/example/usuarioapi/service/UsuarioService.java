package org.example.usuarioapi.service;

import org.example.usuarioapi.model.Usuario;
import org.example.usuarioapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario findById(Integer id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null);
    }

    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void delete(Integer id){
        usuarioRepository.deleteById(id);
    }
}
