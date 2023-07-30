package primer.api.primerApi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import primer.api.primerApi.entitie.Lead;
import primer.api.primerApi.validators.EmailValidator;

@RestController
public class LeadController {
    @PostMapping("/api/newslatter")
    public String registrarCorreo(@RequestBody Lead lead) {
    EmailValidator emailObjeto = new EmailValidator();
    if(!emailObjeto.esValidoPregunta(lead.getEmail())){
        return "no es valido";
    }
    else {
        return "es valido";
    }
    }
}