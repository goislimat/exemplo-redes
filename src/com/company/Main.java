package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        int i = 0;

        for(;;) {
            Cliente cli = new Cliente(i);
            clientes.add(cli);
            System.out.println("NOVA CONEXÃO >> Cliente: " + i);
            i++;

            new Thread(cli).start();

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
