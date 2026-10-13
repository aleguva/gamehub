/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
