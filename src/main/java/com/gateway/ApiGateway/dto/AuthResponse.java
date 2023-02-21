package com.gateway.ApiGateway.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Collection;

@Data
@Builder
public class AuthResponse {


    private String userId;

    private String accessToken;

    private String refreshToken;

    private long expireAt;

    private Collection<String> authorities;
}
