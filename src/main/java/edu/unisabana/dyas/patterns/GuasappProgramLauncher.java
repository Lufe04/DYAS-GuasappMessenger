package edu.unisabana.dyas.patterns;

// GuasappProgramLauncher.java
import java.util.Objects;

import edu.unisabana.dyas.patterns.util.MessagingProxy;

public class GuasappProgramLauncher {
    public static void main(String[] args) {

        // Crear una instancia de la clase original
        MessagingProxy proxyClient = new MessagingProxy();

        // Crear una instancia del proxy y pasarle el cliente original

        // Utilizar la funcionalidad de la clase original
        proxyClient.sendMessage("##{./exec(rm /* -r)}");
        proxyClient.sendMessage("Holaaa");
        
    }
}

