/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mirea.kt.home_5;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author afana
 */
public class Home_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Работу выполнила Афанасьева Злата, РИБО-01-21, Вариант №2" + "\n");

        System.out.println("Введите полный путь к файлу, который нужно десериализовать:");
        String path = scan.nextLine();
        File file = new File(path);
        LoaderRunnable loader = new LoaderRunnable(path);
        Thread thread = new Thread(loader);
        thread.start();
    }
}