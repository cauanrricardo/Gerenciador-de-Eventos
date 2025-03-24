package app;

import java.time.LocalDateTime;

public class Evento {
    private int id;
    private String name;
    private String local;
    private boolean ativo;
    private LocalDateTime dataHora;

    public Evento(int id, String name, String local, boolean ativo, LocalDateTime dataHora) {
        this.id = id;
        this.name = name;
        this.local = local;
        this.ativo = ativo;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void ativar() {
        this.ativo = true;
    }

    public void desativar() {
        this.ativo = false;
    }

    @Override
    public String toString() {
        return String.format(
                "ID: %d - Nome: %s - Data: %s - Local %s - Status: %s",
                id, name, dataHora, local, (ativo ? "Ativo" : "Falso")); // ternario, se for true = ativo, caso seja
                                                                         // false, = falso;
    }
}
