package org.exemple.service;

import org.exemple.data.TokenDto;
import org.exemple.ports.api.TokenServicePort;
import org.exemple.ports.spi.TokenPersistencePort;

import java.io.IOException;
import java.net.URISyntaxException;

public class TokenServiceImpl implements TokenServicePort {

    private final TokenPersistencePort tokenPersistencePort;

    public TokenServiceImpl(TokenPersistencePort tokenPersistencePort) {
        this.tokenPersistencePort = tokenPersistencePort;
    }

    @Override
    public TokenDto getTokenByUserPassword(String user, String password) throws URISyntaxException, IOException {
        return tokenPersistencePort.getTokenByUserPassword(user, password);
    }
}
