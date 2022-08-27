package com.sistema.examenes.repositories;

import com.sistema.examenes.entities.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Rol, Long> {
}
