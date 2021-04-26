package org.idvlop.cinemaAppClient.models;



public enum TicketStatus {
    NEW("Новый"),
    IN_PROGRESS("Сеанс идет"),
    EXPIRED("Истек");

    private final String status;

    TicketStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return this.getStatus();
    }
}
