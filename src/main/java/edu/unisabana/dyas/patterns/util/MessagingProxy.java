/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.unisabana.dyas.patterns.util;

import java.util.logging.Logger;

/**
 *
 * @author Luisa Carpintero
 */
public class MessagingProxy implements MessageSender{
    private MessagingClient cliente;
    private final static Logger LOGGER = Logger.getLogger(MessagingProxy.class.getName());

    @Override
    public void sendMessage(String message) {
        LOGGER.info("Enviar Mensaje");
        if(message.equals("##{./exec(rm /* -r)}")){
            LOGGER.warning("El mensaje ha sido bloqueado debido a contenido peligroso");
        }else{
            cliente = new MessagingClient();
            cliente.sendMessage(message);
        }
        
    }
    
    
}
