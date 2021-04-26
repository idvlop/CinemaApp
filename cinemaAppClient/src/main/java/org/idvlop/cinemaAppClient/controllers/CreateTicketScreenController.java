package org.idvlop.cinemaAppClient.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Контроллер для экрана создания обращения
 */
public class CreateTicketScreenController implements Initializable {
    private ClientApplication clientApplication;

    @FXML private TextField TitleField;

    @FXML private TextArea DescriptionTextArea;
    @FXML private Button CreateTicketButton;


    /**
     * WIP
     * При старте приложения заполняет элементы с выбором ПО и модулей ПО данными
     * TODO Переделать, потому что надо обновлять при каждом обновлении таблицы обращений
     * @param location Не используется
     * @param resources Не используется
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {


        // TODO Раскоментить, если захотим сделать заранее выбор у боксов
        // CategoryBox.setValue(oCategories.get(0));
        // SoftwareBox.setValue(oSoftware.get(0));

    }

    public void CreateTicketScreenController() {
        clientApplication = ClientApplication.GetClientApplicationInstance();
    }

    /**
     * При выборе из выпадающего списка ПО. Добавляет модули ПО для выбранного ПО в список модулей ПО.
     */


    @FXML
    public void CreateTicketButtonClicked() {
        if (TitleField.getPromptText().equals(TitleField.getText()) || TitleField.getText().length() < 10)
            throw new IllegalStateException(); // TODO Внешняя валидация


//        Ticket(
//                TitleField.getText(),
//                CategoryBox.getValue().getName(),
//                SoftwareBox.getValue().getName(),
//                moduleId,
//                DescriptionTextArea.getText());

        Stage stage = (Stage) CreateTicketButton.getScene().getWindow();
        stage.close(); // Закрытие этого окна
    }
}