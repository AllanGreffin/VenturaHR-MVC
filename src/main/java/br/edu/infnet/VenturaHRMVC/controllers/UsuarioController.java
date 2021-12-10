package br.edu.infnet.VenturaHRMVC.controllers;

import br.edu.infnet.VenturaHRMVC.models.Usuario;
import br.edu.infnet.VenturaHRMVC.services.UsuarioService;
import java.net.http.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping(value = "")
	public String telaIndex() {
		return "index";
	}
    
    @RequestMapping("/login")
    public ModelAndView logarNoSite(String email, String senha){
        ModelAndView retorno = new ModelAndView("index");
        if(StringUtils.hasText(email) && StringUtils.hasText(senha)){
            ResponseEntity<Usuario> response = usuarioService.obterPorEmail(email);
            Usuario usuario;
            if(response.getStatusCode().is2xxSuccessful()){
                usuario = response.getBody();
            }else{
                retorno.addObject("erro", "Usuário não encontrado");
                return retorno;
            }
            String destino = "";
            if(usuario != null && senha.equals(usuario.getSenha())){
                destino = "logado";
                retorno.setViewName(destino);
                retorno.addObject("usuario", usuario);
            }else{
                retorno.addObject("erro", "Login inválido");
            }
        }else{
            retorno.addObject("erro", "Os campos são obrigatórios");
        }
        return retorno;
    }
    
}
