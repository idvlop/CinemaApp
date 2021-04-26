package org.idvlop.cinemaAppClient.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableRow;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import org.idvlop.cinemaAppClient.ScreenManager;
import org.idvlop.cinemaAppClient.models.Ticket;
import org.idvlop.cinemaAppClient.models.User;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

import static org.idvlop.cinemaAppClient.models.Ticket.tickets;


/**
 * Контроллер экрана со списком обращений
 */
@Component
public class MemberTicketsScreenController implements Initializable {
    public static MemberTicketsScreenController memberTicketsScreenController;
    private ClientApplication clientApplication;
    private ApplicationContext context;

    @FXML private Text Logo;
    @FXML private Text Tickets;
    @FXML private Text MyProfile;
    @FXML private ImageView MyProfileImage;
    @FXML private Text MyOrganisation;
    @FXML private ImageView MyOrganisationImage;
    @FXML private ImageView PlaceholderImage;
    @FXML private Button CreateTicketButton;
    @FXML private Button RefreshTableButton;
    @FXML private Button ChangeCreatorFilterButton;
    @FXML private TableView<Ticket> TicketsTable;

    @FXML public TableColumn<Ticket, Integer> id;
    @FXML public TableColumn<Ticket, String> title;
    @FXML public TableColumn<Ticket, String> creator;
    @FXML public TableColumn<Ticket, String> status;
    @FXML public TableColumn<Ticket, String> category;
    @FXML public TableColumn<Ticket, String> creationDate;
    @FXML public TableColumn<Ticket, String> changeDate;
    @FXML public TableColumn<Ticket, String> software;
    @FXML public TableColumn<Ticket, String> helper;

    public ObservableList<Ticket> oTickets = FXCollections.observableArrayList(tickets);

    public static boolean showOnlyCurrentUserTickets = false;
    public static SimpleDateFormat dateFormat = new SimpleDateFormat("dd:MM:yyyy, HH:mm"); // Надо переводить потом дату в строку, но хз как в таблице хранить

    /**
     * WIP
     * Запускается при подготовке старта приложения.
     * Выполняются первичные настройки у столбцов таблицы обращений.
     * @param location По идее ссылка на fxml файл, но не используется
     * @param resources По идее путь до файла с ресурсами, но не используется
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        id.setCellValueFactory(new PropertyValueFactory<>("Id"));
        title.setCellValueFactory(new PropertyValueFactory<>("Title"));
        creator.setCellValueFactory(new PropertyValueFactory<>("Creator"));
        status.setCellValueFactory(new PropertyValueFactory<>("Status"));
        category.setCellValueFactory(new PropertyValueFactory<>("Category"));
        creationDate.setCellValueFactory(new PropertyValueFactory<>("CreationDate"));
        changeDate.setCellValueFactory(new PropertyValueFactory<>("ChangeDate"));
        software.setCellValueFactory(new PropertyValueFactory<>("Software"));
        helper.setCellValueFactory(new PropertyValueFactory<>("Helper"));

        oTickets = FXCollections.observableArrayList(tickets);
        TicketTableSetRowFactory();
        ScreenManager.mainScreen.focusedProperty().addListener((obs, oldVal, newVal) -> RefreshTicketTable());
        RefreshTicketTable();
    }

    /**
     * Используется для работы со сценами (переходами по экранам). Пока не разобрался как работает.
     */
    public MemberTicketsScreenController() {
        memberTicketsScreenController = this;
        clientApplication = ClientApplication.GetClientApplicationInstance();

        // TODO Выделить в отдельный метод для ввода Placeholder обращений
        // Используется для добавления начальных данных в таблицу при запуске. Запускается при каждом входе пользователя.
        // Может быть древним и не используемым
        tickets.add(
                new Ticket()
        );
    }

    public void TicketTableSetRowFactory() {
        TicketsTable.setRowFactory(ticketTableView -> {
            TableRow<Ticket> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    Ticket rowData = row.getItem();
                    System.out.println(rowData);
                    try {
                        ShowTicketUserScreen();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    // TODO Вызов метода с открытием нового окна для просмотра обращения
                }
            });
            return row;
        });
    }



    /**
     * Обновление таблицы обращений по желанию пользователя
     */
    @FXML
    public void RefreshTableButtonClicked() {
        RefreshTicketTable();
    }

    /**
     * Обновляет таблицу тикетов на GUI. Если пользователь просил показывать толко его обращения, то делаем так.
     * Переводим лист в читаемый javafx формат, потом показываем.
     */
    @FXML
    public void RefreshTicketTable() {
        if (showOnlyCurrentUserTickets)
            oTickets = FXCollections.observableArrayList(new ArrayList<Ticket> (tickets
                    .stream().filter(ticket -> ticket.getClient() == User.currentUser.getId())
                    .collect(Collectors.toList())));
        else
            oTickets = FXCollections.observableArrayList(tickets);
        TicketsTable.setItems((oTickets));
    }

    /**
     * Изменение с просмотра всех обращений на обращения активного пользователя и обратно при повторном клике
     */
    @FXML
    public void ChangeCreatorFilterButtonClicked() {
        showOnlyCurrentUserTickets = !showOnlyCurrentUserTickets;
        System.out.println("OnlyCUTickets - " + showOnlyCurrentUserTickets);
        RefreshTicketTable();
    }

    /**
     * Запускает набор действий для создания нового окна с созданием обращения
     */
    @FXML
    public void CreateTicketButtonClicked() {
        ScreenManager.CreateTicket();
        RefreshTicketTable(); // Не будет лишним
    }

    /**
     * При двойном клике на ячейку таблицы открывает просмотр обращения
     * @throws IOException Нужен из-за смены сцены
     */
    @FXML
    public void ShowTicketUserScreen() throws IOException{
        ScreenManager.ShowTicket();
    }

    /**
     * WIP
     * Производит выход из аккаунта, позволяя сменить пользователя.
     * @throws IOException Нужен из-за смены сцены
     */
    @FXML
    public void LogOutButtonClicked() throws IOException {
        ScreenManager.LogOut(); // Метод временно назначен на логотип
    }
}
