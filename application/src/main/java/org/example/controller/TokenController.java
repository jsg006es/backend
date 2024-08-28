package org.example.controller;

import org.example.properties.TokenProperties;
import org.exemple.data.TokenDto;
import org.exemple.ports.api.TokenServicePort;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URISyntaxException;

@RestController
public class TokenController {

    private final TokenServicePort tokenServicePort;
    private final TokenProperties tokenProperties;

    public TokenController(TokenServicePort tokenServicePort, TokenProperties tokenProperties) {
        this.tokenServicePort = tokenServicePort;
        this.tokenProperties = tokenProperties;
    }

    @GetMapping("/get-token")
    public TokenDto getTokenByUserPassword() throws URISyntaxException, IOException {
        return tokenServicePort.getTokenByUserPassword(tokenProperties.getUsernameToken(), tokenProperties.getPassword());
    }

}
