package com.malek.moto.repos;

import com.malek.moto.entities.Moto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotoRepository  extends JpaRepository<Moto, Long> {
}
