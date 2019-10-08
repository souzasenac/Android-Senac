package br.senac.es.helpdesk.model;

public class Mensagem {
   private long id;
   private String texto;
   private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        return this.texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Mensagem(long id , String texto ,Status status  ) {
        this.id = id;
        this.texto = texto;
        this.status =status;

    }


}
