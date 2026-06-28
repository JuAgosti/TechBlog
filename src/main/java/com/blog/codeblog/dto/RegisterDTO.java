package com.blog.codeblog.dto;

import com.blog.codeblog.enums.UserRole;

public record RegisterDTO (
        String login,
        String senha,
        UserRole role
){
}
