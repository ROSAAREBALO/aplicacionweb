package proyectogrado.aplicacionweb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by AREBALO on 2/7/2018.
 */
@Entity
public class Producto {
    @Id
    @GeneratedValue
    private Long id;
    private String nombre;
    private Long cantidad;
    private String tipoProducto;
    private Double constanteProducto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public Double getConstanteProducto() {
        return constanteProducto;
    }

    public void setConstanteProducto(Double constanteProducto) {
        this.constanteProducto = constanteProducto;
    }
}
