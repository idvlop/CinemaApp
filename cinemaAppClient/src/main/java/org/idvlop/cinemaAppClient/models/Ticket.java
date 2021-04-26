package org.idvlop.cinemaAppClient.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Ticket {
    private SimpleIntegerProperty id;
    private SimpleIntegerProperty hallPlace;
    private SimpleIntegerProperty session;
    private SimpleIntegerProperty client;

    public static ArrayList<Ticket> tickets = new ArrayList<Ticket>(); // Список обращений всей системы
    public static int nextId = 1;

//    /**
//     * WIP
//     * TODO Переделать согласно БД + нужным для таблицы полям
//     * Создание обращения (тикета). Обращение - основная сущность системы
//     * @param title Тема обращения, не менее 10 символов
//     * @param creator ФИО создателя обращения (нужно будет убрать, потом брать ссылкой через ID)
//     * @param creatorId ID создателя обращения
//     * @param status Статус обращения (отдельный файл статусов)
//     * @param category Категория обращения (отдельный файл категорий)
//     * @param creationDate Дата создания, ставится автоматически при создании обращения
//     * @param changeDate Дата последнего изменения/комментирования/смены статуса обращения
//     * @param software Название ПО, по которому создаётся обращение
//     * @param moduleId Название модуля ПО, по которому создаётся обращение
//     * @param helper Разработчик, назначенный на работу с обращением
//     */
//    public Ticket(
//                  String title,
//                  Integer hallPlace,
//                  Integer session,
//                  Integer client) {
//        this.id = new SimpleIntegerProperty(nextId++);
//        this.hallPlace = new SimpleStringProperty(hallPlace);
//        this.session = new SimpleStringProperty(session);
//        this.client = new SimpleIntegerProperty(client);
//    }
//
//    /**
//     * WIP
//     *
//     * Основной метод создания обращения, используется в GUI.
//     * @param title Название обращения, минимум 10 символов
//     * @param category Категория обращения, на выбор одна из 3 кнопок
//     * @param software Название ПО, выбирается пользователем
//     * @param moduleId Название модуля ПО, выбирается пользователем
//     * @param description Полное текстовое описание обращения
//     */
//    public static void AddTicket(
//        String title,
//        String category,
//        String software, // TODO переделать в softwareId
//        Integer moduleId,
//        String description) {
//            tickets.add(new Ticket(
//                    title,
//                    User.currentUser.getId(),
//                    TicketStatus.NEW,
//                    category,
//                    new Date(),
//                    null,
//                    software,
//                    moduleId,
//                    null,
//                    description
//            ));
//    }
//
//    @Override
//    public String toString() {
//        return this.getTitle() + " - " + this.getCategory() + " - " + this.getDescription();
//    }
//
//    public int getId() {
//        return id.get();
//    }
//
//    public String getTitle() {
//        return title.get();
//    }
//
//    public void setTitle(String title) {
//        this.title.set(title);
//    }
//
//    public String getCreator() {
//        return creator.get();
//    }
//
//    public void setCreator(String creator) {
//        this.creator.set(creator);
//    }
//
//    public int getCreatorId() {
//        return creatorId.get();
//    }
//
//    public void setCreatorId(int creatorId) {
//        this.creatorId.set(creatorId);
//    }
//
//    public TicketStatus getStatus() {
//        return status.get();
//    }
//
//    public void setStatus(TicketStatus status) {
//        this.status.set(status);
//    }
//
//    public String getCategory() {
//        return category.get();
//    }
//
//    public void setCategory(String category) {
//        this.category.set(category);
//    }
//
//    public Date getCreationDate() {
//        return creationDate.get();
//    }
//
//    public void setCreationDate(Date creationDate) {
//        this.creationDate.set(creationDate);
//    }
//
//    public Date getChangeDate() {
//        return changeDate.get();
//    }
//
//    public void setChangeDate(Date changeDate) {
//        this.changeDate.set(changeDate);
//    }
//
//    public String getSoftware() {
//        return software.get();
//    }
//
//    public void setSoftware(String software) {
//        this.software.set(software);
//    }
//
//    public Integer getModuleId() {
//        return moduleId.get();
//    }
//
//    public void setModuleId(Integer moduleId) {
//        this.moduleId.set(moduleId);
//    }
//
//    public String getHelper() {
//        return helper.get();
//    }
//
//    public void setHelper(String helper) {
//        this.helper.set(helper);
//    }
//
//    public String getDescription() {
//        return description.get();
//    }
//
//    public void setDescription(String description) {
//        this.description.set(description);
//    }
}
