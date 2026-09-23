package com.gpcoder.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Host Name: " + ip.getHostName());
        System.out.println("IP Address: " + ip.getHostAddress());

        ip = InetAddress.getByName("www.studytonight.com");
        System.out.println("\nHost Name: " + ip.getHostName());
        System.out.println("IP Address: " + ip.getHostAddress());

        System.out.println("\nAll address of google:");
        InetAddress[] sw = InetAddress.getAllByName("www.google.com");
        for (InetAddress address : sw) {
            System.out.println(address);
        }
    }
}