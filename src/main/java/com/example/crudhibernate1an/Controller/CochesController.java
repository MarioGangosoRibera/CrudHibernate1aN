package com.example.crudhibernate1an.Controller;

import com.example.crudhibernate1an.DAO.CocheDAO;
import com.example.crudhibernate1an.Model.Coche;
import com.example.crudhibernate1an.util.HibernateUtil;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import org.hibernate.SessionFactory;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class CochesController implements Initializable {

    @FXML
    private TableView<Coche> TableView;

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnBorrar;

    @FXML
    private Button btnInsertar;

    @FXML
    private Button btnLimpiar;

    @FXML
    private Button btnVerMultas;

    @FXML
    private ComboBox<String> cbTipo;

    @FXML
    private TableColumn<?, ?> columnMatricula;

    @FXML
    private TableColumn<?, ?> columnTipo;

    @FXML
    private TableColumn<?, ?> columnMarca;

    @FXML
    private TableColumn<?, ?> columnModelo;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtMatricula;

    @FXML
    private TextField txtModelo;

    SessionFactory sessionFactory;
    org.hibernate.Session session;
    Coche cocheSeleccionado;

    CocheDAO cocheDao = new CocheDAO();

    private final ArrayList <String> listaTipos = new ArrayList<>(Arrays.asList("Gasolina", "Diesel", "Hibrido", "Electrico"));

    private ObservableList <Coche> listacoches;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        sessionFactory = HibernateUtil.getSessionFactory();
        session = HibernateUtil.getSession();

        cbTipo.getItems().addAll(listaTipos);

        columnMatricula.setCellValueFactory(new PropertyValueFactory<>("matricula"));
        columnMarca.setCellValueFactory(new PropertyValueFactory<>("marca"));
        columnModelo.setCellValueFactory(new PropertyValueFactory<>("modelo"));
        columnTipo.setCellValueFactory(new PropertyValueFactory<>("tipo"));
        listacoches = FXCollections.observableArrayList(cocheDao.listarCoches(session));
        TableView.setItems(listacoches);
    }
}
