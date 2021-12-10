package br.edu.infnet.VenturaHRMVC.services;

import br.edu.infnet.VenturaHRMVC.models.Usuario;
import java.net.http.HttpResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "http://localhost:8081/usuarios", name = "usuarioService", decode404 = true)
public interface UsuarioService {
    
    @GetMapping()
    ResponseEntity<Usuario> obterPorEmail(@RequestParam String email);
    
    @PostMapping
    ResponseEntity<Usuario> inserirUsuario(Usuario usuario);
}
