package proyectogrado.aplicacionweb.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import proyectogrado.aplicacionweb.domain.Cliente;
import proyectogrado.aplicacionweb.service.ClienteService;
import java.util.Date;
import java.util.List;

/**
 * Created by AREBALO on 12/6/2018.
 */
@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    ClienteService clienteservice;
    @RequestMapping(method = RequestMethod.POST)
    public void crearCliente(@RequestBody RequestClienteDTO newRequestClienteDTO){
      Cliente clienteNuevo=new Cliente();
      String nombre=newRequestClienteDTO.getNombre();
      String apellidoPaterno=newRequestClienteDTO.getApellidoPaterno();
      String apellidoMaterno=newRequestClienteDTO.getApellidoMaterno();
      Long ci=newRequestClienteDTO.getCi();
      String direccion=newRequestClienteDTO.getDireccion();
      Long telefono=newRequestClienteDTO.getTelefono();
      String correo=newRequestClienteDTO.getCorreo();
      Date fechaNacimiento=newRequestClienteDTO.getFechaNacimiento();

      clienteNuevo.setNombre(nombre);
      clienteNuevo.setApellidoPaterno(apellidoPaterno);
      clienteNuevo.setApellidoMaterno(apellidoMaterno);
      clienteNuevo.setCi(ci);
      clienteNuevo.setDireccion(direccion);
      clienteNuevo.setTelefono(telefono);
      clienteNuevo.setCorreo(correo);
      clienteNuevo.setFechaNacimiento(fechaNacimiento);
      clienteservice.addCliente(clienteNuevo);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Cliente> listaClientes(){
        return clienteservice.getListaClientes();
    }



    public static class RequestClienteDTO {
        private String nombre;
        private String apellidoPaterno;
        private String apellidoMaterno;
        private Long ci;
        private String direccion;
        private Long telefono;
        private String correo;
        private Date fechaNacimiento;

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellidoPaterno() {
            return apellidoPaterno;
        }

        public void setApellidoPaterno(String apellidoPaterno) {
            this.apellidoPaterno = apellidoPaterno;
        }

        public String getApellidoMaterno() {
            return apellidoMaterno;
        }

        public void setApellidoMaterno(String apellidoMaterno) {
            this.apellidoMaterno = apellidoMaterno;
        }

        public Long getCi() {
            return ci;
        }

        public void setCi(Long ci) {
            this.ci = ci;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public Long getTelefono() {
            return telefono;
        }

        public void setTelefono(Long telefono) {
            this.telefono = telefono;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public Date getFechaNacimiento() {
            return fechaNacimiento;
        }

        public void setFechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
        }
    }
}
