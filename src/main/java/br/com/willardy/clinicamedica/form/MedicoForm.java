package br.com.willardy.clinicamedica.form;

import br.com.willardy.clinicamedica.enums.Especialidade;

public record MedicoForm(String nome, String email, String crm, Especialidade especialidade, EnderecoForm endereco) {
}
