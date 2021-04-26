package org.idvlop.cinemaAppClient.models;

public enum Role {
    GUEST("Гость"),
    ADMIN("Администратор"),
    MANAGER("Менеджер"),
    WORKER("Сотрудник"),
    CLIENT("Клиент");

    private final String status;

    Role(String status) {
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
