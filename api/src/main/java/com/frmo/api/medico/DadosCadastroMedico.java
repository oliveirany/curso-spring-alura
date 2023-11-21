package com.frmo.api.medico;

import com.frmo.api.endereco.Endereco;

public record DadosCadastroMedico(String nome,
                                  String email,
                                  String crm,
                                  Especialidade especialidade,
                                  Endereco endereco) {}
