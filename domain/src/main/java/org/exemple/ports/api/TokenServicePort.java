package org.exemple.ports.api;

import org.exemple.data.TokenDto;

import java.io.IOException;
import java.net.URISyntaxException;

public interface TokenServicePort {

    TokenDto getTokenByUserPassword(String user, String password) throws URISyntaxException, IOException;
}
