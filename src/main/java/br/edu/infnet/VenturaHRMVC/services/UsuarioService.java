package br.edu.infnet.VenturaHRMVC.services;

//@FeignClient(url = "http://localhost:8081/usuarios", name = "usuarioService")

import br.edu.infnet.VenturaHRMVC.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface UsuarioService {
    
//    @GetMapping(path = {"/email/{email}"})
//    Usuario obterPorEmail(@PathVariable String email);
//    
//    @PostMapping
//    Usuario inserirUsuario(Usuario usuario);
}
