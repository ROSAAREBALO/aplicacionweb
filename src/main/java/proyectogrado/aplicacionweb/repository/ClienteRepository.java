package proyectogrado.aplicacionweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectogrado.aplicacionweb.domain.Cliente;

/**
 * Created by AREBALO on 12/6/2018.
 */
public interface ClienteRepository extends JpaRepository <Cliente,Long> {
}
