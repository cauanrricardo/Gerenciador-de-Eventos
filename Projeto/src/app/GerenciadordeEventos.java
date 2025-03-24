package app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GerenciadordeEventos {

    private List<Evento> eventos;

    public GerenciadordeEventos() {
        this.eventos = new ArrayList<>();
    }

    public void adicionarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void listarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento);
            System.out.println("-----------");
        }
    }

    public Evento buscarEvento(int id) {
        for (Evento evento : eventos) {
            if (evento.getId() == id) {
                return evento;
            }
        }
        return null;
    }

    public void removerEvento(int id) {
        for (int i = 0; i < eventos.size(); i++) {
            Evento evento = eventos.get(i);
            if (evento.getId() == id) {
                eventos.remove(i);
                break;
            }
        }
    }

        //vai atualizar o evento com os novos dados que serao passados como parametros
    public void atualizarEvento(int id, String nome, LocalDateTime data, String local) {
        Evento evento = buscarEvento(id);
        if (evento != null) {
            evento.setName(nome);
            evento.setDataHora(data);
            evento.setLocal(local);
        }
    }

    public void listarEventosAtivos() {
        for (Evento evento : eventos) {
            if (evento.isAtivo()) {
                evento.toString();
                System.out.println("---------");
            }
        }
    }
}
