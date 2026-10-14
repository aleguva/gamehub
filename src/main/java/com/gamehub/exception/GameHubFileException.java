package com.gamehub.exception;

/**
 *
 * @author Alejandro Guzman Vasquez
 */
public class GameHubFileException extends Exception {

    private static final long serialVersionUID = 1L;

    public GameHubFileException(String message) {
        super(message);
    }

    public GameHubFileException(String message, Throwable cause) {
        super(message, cause);
    }

}
