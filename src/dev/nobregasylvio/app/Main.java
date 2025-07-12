package dev.nobregasylvio.app;

import dev.nobregasylvio.app.entities.Smartphone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Smartphone smartphone = new Smartphone();

        int opcao;
        boolean continua = true;

        do {
            menuPrincipal();
            opcao = scan.nextInt();
            switch (opcao) {
                case 1 -> handleLigar(scan, smartphone);
                case 2 -> smartphone.atender();
                case 3 -> smartphone.iniciarCorreioVoz();
                case 4 -> {
                    System.out.println("Abrindo navegador de internet...");
                    handleNavegador(scan, smartphone);
                }
                case 5 -> {
                    System.out.println("Abrindo reprodutor musical...");
                    handleReprodutor(scan, smartphone);
                }
                case 0 -> {
                    System.out.println("Encerrando...");
                    continua = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        } while(continua);

        scan.close();
    }

    public static void menuPrincipal() {
        System.out.println("----- SIMULADOR SMARTPHONE -----");
        System.out.println("1: Realizar ligação");
        System.out.println("2: Atender ligação");
        System.out.println("3: Ouvir correio de voz");
        System.out.println("4: Abrir Navegador de internet");
        System.out.println("5: Abrir Reprodutor musical");
        System.out.println("0: Encerrar");
        System.out.println();
        System.out.print("Escolha uma opção: ");
    }

    public static void menuNavegadorInternet() {
        System.out.println("----- INTERNET -----");
        System.out.println("1: Exibir Página");
        System.out.println("2: Criar nova aba");
        System.out.println("3: Atualizar página");
        System.out.println("0: Menú anterior");
        System.out.println();
        System.out.print("Escolha uma opção: ");
    }

    public static void menuReprodutorMusical() {
        System.out.println("----- REPRODUTOR MUSICAL -----");
        System.out.println("Escolha uma opção:");
        System.out.println("1: Tocar");
        System.out.println("2: Pausar");
        System.out.println("3: Selecionar música");
        System.out.println("0: Menú anterior");
    }

    public static void handleLigar (Scanner scan, Smartphone smartphone) {
        System.out.print("Digite o numero para quem quer ligar: ");
        String telefone = scan.next();
        smartphone.ligar(telefone);
    }

    public static void handleNavegador (Scanner scan, Smartphone smartphone) {
        int opcaoNavegador;
        boolean continua = true;

        do {
            menuNavegadorInternet();
            opcaoNavegador = scan.nextInt();
            switch (opcaoNavegador) {
                case 1 -> {
                    System.out.print("Digite a URL da página: ");
                    String url = scan.next();
                    smartphone.exibirPagina(url);
                }
                case 2 -> smartphone.adicionarNovaAba();
                case 3 -> smartphone.atualizarPagina();
                case 0 -> {
                    System.out.println("Voltando ao menú anterior");
                    continua = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        } while (continua);
    }

    public static void handleReprodutor (Scanner scan, Smartphone smartphone) {
        int opcaoReprodutor = 0;
        boolean continua = true;

        do {
            menuReprodutorMusical();
            opcaoReprodutor = scan.nextInt();
            switch (opcaoReprodutor) {
                case 1 -> smartphone.tocar();
                case 2 -> smartphone.pausar();
                case 3 -> {
                    System.out.print("Digite qual música quer reproduzir: ");
                    String musica = scan.next();
                    smartphone.selecionarMusica(musica);
                }
                case 0 -> {
                    System.out.println("Voltando ao menú anterior");
                    continua = false;
                }
                default -> System.out.println("Opção inválida.");
            }
        } while (continua);
    }
}