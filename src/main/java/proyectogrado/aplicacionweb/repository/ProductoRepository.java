package proyectogrado.aplicacionweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import proyectogrado.aplicacionweb.domain.Producto;

/**
 * Created by AREBALO on 2/7/2018.
 */
public interface ProductoRepository extends JpaRepository<Producto,Long>{
}
