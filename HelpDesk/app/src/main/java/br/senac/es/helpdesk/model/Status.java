package br.senac.es.helpdesk.model;

public enum  Status {
    ENVIADA {
        @Override
        public String toString() {
            return "Enviada";
        }
    },
    NAOENVIADA {
        @Override
        public String toString() {
            return "Não enviada";
        }
    };
}