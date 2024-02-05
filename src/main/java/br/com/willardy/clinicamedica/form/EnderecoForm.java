package br.com.willardy.clinicamedica.form;

public record EnderecoForm(
        String logradouro,
        String bairro,
        String cep,
        String cidade,
        String uf,
        String complemento,
        String numero) {
}