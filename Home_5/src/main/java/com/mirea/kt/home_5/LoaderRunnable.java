/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.home_5;

import com.mirea.kt.example.Message;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author afana
 */
public class LoaderRunnable implements Runnable {

    private String path;

    public LoaderRunnable(String path) {
        this.path = path;
    }

    @Override
    public void run() {
        if (path != null && new File(path).exists()) {
            FileInputStream fis;
            try {
                fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                Message message = (Message) ois.readObject();
                ois.close();
                System.out.println("\n" + message);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Ошибка десериализации!");
                System.out.println("\n" + e.getMessage());
            }
        }
    }
}
