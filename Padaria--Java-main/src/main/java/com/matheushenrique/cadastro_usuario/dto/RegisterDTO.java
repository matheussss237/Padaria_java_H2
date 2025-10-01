package com.matheushenrique.cadastro_usuario.dto;

import com.matheushenrique.cadastro_usuario.role.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
