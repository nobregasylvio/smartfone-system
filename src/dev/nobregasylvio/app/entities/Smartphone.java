package dev.nobregasylvio.app.entities;

import dev.nobregasylvio.app.interfaces.AparelhoTelefonico;
import dev.nobregasylvio.app.interfaces.NavegadorInternet;
import dev.nobregasylvio.app.interfaces.ReprodutorMusical;

public class Smartphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo Página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba adicionada...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
