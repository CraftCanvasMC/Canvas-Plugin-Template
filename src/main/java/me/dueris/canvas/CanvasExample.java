package me.dueris.canvas;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class CanvasExample extends JavaPlugin implements Listener{

    @Override
    public void onEnable(){
        // OnEnable
        String msg = "Hello world!";
        System.out.println(msg);
        sendBase64Message(msg);
        sendEncryptedMessage(msg, "AES");
    }

    @Override
    public void onDisable(){
        // OnDisable
    }

    // Prints a string message in a base64 encryption
    public void sendBase64Message(String msg){
        System.out.println(
            Bukkit.getServer().getObfuscator().encodeBase64(msg)
        );
    }

    // Prints a String message in an encryption method of your choice
    public void sendEncryptedMessage(String msg, String encryptionMethod){ // Encryption method being like AES, RSA, SHA, or TLS
        System.out.println(
            Bukkit.getServer().getObfuscator().encrypt(
                msg,
                Bukkit.getServer().getObfuscator().generateEncryptionKey(encryptionMethod),
                encryptionMethod
            )
        );
    }
}