package br.edu.infnet.VenturaHRMVC.services;

import br.edu.infnet.VenturaHRMVC.models.Usuario;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8081/usuarios", name = "usuarioService")
public interface UsuarioService {
    
    @GetMapping()
    Usuario obterPorEmail(@RequestParam String email);
    
    @PostMapping
    Usuario inserirUsuario(Usuario usuario);
}
