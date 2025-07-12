package dev.nobregasylvio.app;

import dev.nobregasylvio.app.entities.Smartphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Smartphone smartphone = new Smartphone();

        int option = 0;



        scan.close();
    }

    public void menuPrincipal() {
        System.out.println("----- SIMULADOR SMARTPHONE -----");
        System.out.println("Escolha uma opção:");
        System.out.println("1: Realizar ligação");
        System.out.println("2: Atender ligação");
        System.out.println("3: Ouvir correio de voz");
        System.out.println("4: Abrir Navegador de internet");
        System.out.println("5: Abrir Reprodutor musical");
    }

    public void menuNavegadorInternet() {
        System.out.println("----- INTERNET -----");
        System.out.println("Escolha uma opção:");
        System.out.println("1: Exibir Página");
        System.out.println("2: Criar nova aba");
        System.out.println("3: Atualizar página");
    }

    public void menuReprodutorMusical() {
        System.out.println("----- REPRODUTOR MUSICAL -----");
        System.out.println("Escolha uma opção:");
        System.out.println("1: Tocar");
        System.out.println("2: Pausar");
        System.out.println("3: Selecionar música");
    }
}