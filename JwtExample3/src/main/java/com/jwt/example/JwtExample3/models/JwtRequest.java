package com.jwt.example.JwtExample3.models;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class JwtRequest {
    private String emailId;
    private String password;
}
