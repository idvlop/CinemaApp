package org.idvlop.cinemaAppClient;

import org.idvlop.cinemaAppClient.models.*;

import java.util.ArrayList;

public class PlaceholdersManager {
    public static void SetUpPlaceholders() {
        SetUpPlaceholderUsers();
    }

    /**
     * Пользователи по умолчанию
     * Пароли хранятся пока что прямо так, поэтому они "admin"
     * TODO приделать хэширование паролей на клиенте
     */
    public static void SetUpPlaceholderUsers() {
        User.users.add(new User("admin", "admin", "Админ Админович", Role.ADMIN.getStatus()));
        User.users.add(new User("newu2011@gmail.com", "admin", "Никита Кононенко", Role.MANAGER.getStatus()));
        User.users.add(new User("pasifficid@gmail.com", "admin", "Денис Ишмурат", Role.ADMIN.getStatus()));
        User.users.add(new User("skywalkersakhno@gmail.com", "admin", "Александр Сахно", Role.CLIENT.getStatus()));
        User.users.add(new User("anna.00kon@gmail.com", "admin", "Анна Конкина", Role.WORKER.getStatus()));
    }

}

