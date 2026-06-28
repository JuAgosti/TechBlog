package com.blog.codeblog.dto;

import com.blog.codeblog.enums.UserRole;

public record AuthenticationDTO(
        String login,
        String senha
) {
}
