package proyectogrado.aplicacionweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import proyectogrado.aplicacionweb.domain.Cliente;
import proyectogrado.aplicacionweb.repository.ClienteRepository;

import java.util.List;

/**
 * Created by AREBALO on 12/6/2018.
 */
@Service
public class ClienteService {
    @Autowired
    ClienteRepository clienterepository;

    public void addCliente(Cliente newCliente){
        clienterepository.save(newCliente);
    }
   public List<Cliente> getListaClientes(){
        return clienterepository.findAll();
   }

}
