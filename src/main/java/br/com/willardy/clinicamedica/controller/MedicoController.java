package br.com.willardy.clinicamedica.controller;

import br.com.willardy.clinicamedica.form.MedicoForm;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medico")
public class MedicoController {

    @PostMapping
    public void cadastrarMedico(@RequestBody MedicoForm form){
        System.out.println(form);
    }
}
