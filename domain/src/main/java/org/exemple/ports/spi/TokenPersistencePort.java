package org.exemple.ports.spi;

import org.exemple.data.TokenDto;

import java.io.IOException;
import java.net.URISyntaxException;

public interface TokenPersistencePort {

    TokenDto getTokenByUserPassword(String user, String password) throws URISyntaxException, IOException;

}
