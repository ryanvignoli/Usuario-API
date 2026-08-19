package org.example.usuarioapi.repository;

import org.example.usuarioapi.model.UsuarioInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioInfoRepository extends JpaRepository<UsuarioInfo, Integer> {
}
