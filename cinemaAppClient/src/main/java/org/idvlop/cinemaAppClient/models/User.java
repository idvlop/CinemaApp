package org.idvlop.cinemaAppClient.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    private SimpleIntegerProperty id;
    private SimpleStringProperty email;
    private SimpleStringProperty password;
    private SimpleStringProperty fullName;
    private SimpleStringProperty role;

    public static ArrayList<User> users = new ArrayList<User>(); // Список пользователей всей системы
    public static User currentUser; // Активный пользователь системы. Меняется после выхода из аккаунта.
    public static int nextId = 1;

    /**
     * WIP ?
     * Создание новых пользователей
     * @param email Электронная почта пользователя
     * @param password Пароль (пока не хэш) пользователя
     * @param fullName ФИО пользователя
     */
    public User(String email,
                String password,
                String fullName, String role) {
        this.id = new SimpleIntegerProperty(nextId++);
        this.email = new SimpleStringProperty(email);
        this.password = new SimpleStringProperty(password);
        this.role = new SimpleStringProperty(role);
    }

}
