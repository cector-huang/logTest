/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maventest;

/**
 *
 * @author huangjiaqi
 */
public class LogTest {
    public static void main(String[] args)
    {
        String url = LogTest.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        System.out.println(url);
        if(url.endsWith(".jar"))
        {
            String path = url.substring(0, url.lastIndexOf("/")+1);
            System.out.println(path);
        }
    }
}
