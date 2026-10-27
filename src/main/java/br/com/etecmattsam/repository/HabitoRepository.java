package br.com.etecmattsam.repository;

import br.com.etecmattsam.entity.Habito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitoRepository extends JpaRepository<Habito, Long> {
}
